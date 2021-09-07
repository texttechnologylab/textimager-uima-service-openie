package org.hucompute.textimager.uima.service.openie;

import io.smallrye.common.constraint.NotNull;

import javax.validation.constraints.NotBlank;

public class OpenIeRequest {
    @NotNull
    @NotBlank
    public String text;

    @NotNull
    @NotBlank
    public String language;
}
