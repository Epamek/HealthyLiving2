package com.networks.teamalexis.healthyliving2;

/**
 * Created by Epamek on 12/9/2017.
 */

import java.util.HashMap;

public class WearableGATTs {
    private static HashMap<String, String> wearableAttributes = new HashMap();
    public static String HR_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";

    static {
        //services
        wearableAttributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        wearableAttributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        //characteristics
        wearableAttributes.put(HR_MEASUREMENT, "Heart Rate Measurement");
        wearableAttributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }

    public static String nameLookup(String uuid, String originalName) {
        String newName = wearableAttributes.get(uuid);
        return newName == null ? originalName : newName;
    }
}
