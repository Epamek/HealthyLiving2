package com.networks.teamalexis.healthyliving2;

import android.app.Activity;
import android.bluetooth.BluetoothGattCharacteristic;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Epamek on 12/5/2017.
 */

public class WearableControlActivity extends Activity {
    private final static String TAG = WearableControlActivity.class.getSimpleName();

    public static final String DEVICE_NAME = "DEVICE_NAME";
    public static final String DEVICE_ADDRESS = "DEVICE_ADDRESS";

    private TextView mConnectionState;
    private TextView mDataField;
    private String mDeviceName;
    private String mDeviceAddress;
    private ExpandableListView mGattServicesList;
    private GATTCommService mGATTCommService;
    private ArrayList<ArrayList<BluetoothGattCharacteristic>> mGattCharacteristics =
            new ArrayList<ArrayList<BluetoothGattCharacteristic>>();
    private boolean mConnected = false;
    private BluetoothGattCharacteristic mNotifyCharacteristic;


}
