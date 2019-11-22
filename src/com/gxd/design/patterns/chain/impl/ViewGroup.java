package com.gxd.design.patterns.chain.impl;

import com.gxd.design.patterns.chain.Event;
import com.gxd.design.patterns.chain.EventHandler;

public class ViewGroup extends EventHandler {
    @Override
    protected boolean consumeEvent(Event event) {
        return false;
    }
}