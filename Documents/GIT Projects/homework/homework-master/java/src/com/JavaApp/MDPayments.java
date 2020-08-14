package com.JavaApp;

import com.google.api.client.util.Key;

import java.util.List;

public class MDPayments {
    @Key("payments")
    private List<MarylandInfo> payments;

    public List<MarylandInfo> getPayments() {
        return payments;
    }
}
