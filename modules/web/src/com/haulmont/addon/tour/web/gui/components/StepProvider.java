/*
 * Copyright (c) 2008-2018 Haulmont. All rights reserved.
 * Use is subject to license terms, see http://www.cuba-platform.com/commercial-software-license for details.
 */

package com.haulmont.addon.tour.web.gui.components;

public interface StepProvider {

    /**
     * Gets the step that is the source of the provider.
     *
     * @return the step that caused the provider
     */
    Step getStep();
}