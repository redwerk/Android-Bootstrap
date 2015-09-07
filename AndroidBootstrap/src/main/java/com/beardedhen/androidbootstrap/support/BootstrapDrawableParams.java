package com.beardedhen.androidbootstrap.support;

import com.beardedhen.androidbootstrap.api.attributes.BootstrapSize;
import com.beardedhen.androidbootstrap.api.attributes.BootstrapTheme;
import com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapTheme;

public class BootstrapDrawableParams {

    private BootstrapTheme bootstrapTheme;
    private BootstrapSize bootstrapSize;

    private boolean roundedCorners;
    private boolean showOutline;
    private boolean enabled;

    public BootstrapDrawableParams() {
        bootstrapTheme = DefaultBootstrapTheme.PRIMARY;
        roundedCorners = true;
        showOutline = false;
    }

    public BootstrapDrawableParams bootstrapType(BootstrapTheme bootstrapTheme) {
        this.bootstrapTheme = bootstrapTheme;
        return this;
    }

    public BootstrapDrawableParams bootstrapSize(BootstrapSize bootstrapSize) {
        this.bootstrapSize = bootstrapSize;
        return this;
    }

    public BootstrapDrawableParams showRoundedCorners(boolean roundedCorners) {
        this.roundedCorners = roundedCorners;
        return this;
    }

    public BootstrapDrawableParams showOutline(boolean showOutline) {
        this.showOutline = showOutline;
        return this;
    }

    public BootstrapDrawableParams enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public BootstrapTheme getBootstrapTheme() {
        return bootstrapTheme;
    }

    public BootstrapSize getBootstrapSize() {
        return bootstrapSize;
    }

    public boolean isRoundedCorners() {
        return roundedCorners;
    }

    public boolean isShowOutline() {
        return showOutline;
    }

    public boolean isEnabled() {
        return enabled;
    }

}