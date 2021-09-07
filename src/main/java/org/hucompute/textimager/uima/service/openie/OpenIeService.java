package org.hucompute.textimager.uima.service.openie;

import edu.knowitall.collection.immutable.Interval;
import edu.knowitall.openie.Argument;
import edu.knowitall.openie.Instance;
import edu.knowitall.openie.OpenIE;
import edu.knowitall.tool.parse.ClearParser;
import edu.knowitall.tool.postag.ClearPostagger;
import edu.knowitall.tool.srl.ClearSrl;
import edu.knowitall.tool.tokenize.ClearTokenizer;
import scala.collection.JavaConversions;
import scala.collection.Seq;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class OpenIeService {

    protected OpenIE openie;

    public OpenIeService() {
        this.openie = new OpenIE(new ClearParser(new ClearPostagger(new ClearTokenizer())), new ClearSrl(), false, false);
    }

    public List<OpenIeExtraction> extract(String text) {
        Seq<Instance> extractions = this.openie.extract(text);
        List<Instance> list_extractions = JavaConversions.seqAsJavaList(extractions);

        List<OpenIeExtraction> result = new ArrayList<>();
        for (Instance instance : list_extractions) {
            List<Argument> list_arg2s = JavaConversions.seqAsJavaList(instance.extr().arg2s());
            for (Argument arg2 : list_arg2s) {
                OpenIeExtraction extraction = new OpenIeExtraction();

                extraction.setConfidence(instance.confidence());

                List<Interval> arg1Offsets = JavaConversions.seqAsJavaList(instance.extr().arg1().offsets());
                extraction.setBeginArg1(arg1Offsets.get(0).start());
                extraction.setEndArg1(arg1Offsets.get(0).end());
                extraction.setValueArg1(instance.extr().arg1().displayText());

                List<Interval> relOffsets = JavaConversions.seqAsJavaList(instance.extr().rel().offsets());
                extraction.setBeginRel(relOffsets.get(0).start());
                extraction.setEndRel(relOffsets.get(0).end());
                extraction.setValueRel(instance.extr().rel().displayText());

                List<Interval> arg2Offsets = JavaConversions.seqAsJavaList(arg2.offsets());
                extraction.setBeginArg2(arg2Offsets.get(0).start());
                extraction.setEndArg2(arg2Offsets.get(0).end());
                extraction.setValueArg2(arg2.displayText());

                extraction.setBegin(arg1Offsets.get(0).start());
                extraction.setEnd(arg2Offsets.get(0).end());

                result.add(extraction);
            }
        }

        return result;
    }
}
