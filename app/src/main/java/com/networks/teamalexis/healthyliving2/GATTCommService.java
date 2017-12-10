package com.networks.teamalexis.healthyliving2;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.IBinder;

import java.util.UUID;

public class GATTCommService extends Service {

    private BluetoothManager mBluetoothManager;
    private BluetoothAdapter mBluetoothAdapter;
    private String mDeviceMACAddress; //Change name!
    private BluetoothGatt mBluetoothGatt;

    private static final int DISCONNECTED = 0;
    private static final int CONNECTING = 1;
    private static final int CONNECTED = 2;

    public final static String GATT_CONNECTED =
            "com.networks.teamalexis.healthyliving2.GATT_CONNECTED";
    public final static String GATT_DISCONNECTED =
            "com.networks.teamalexis.healthyliving2.GATT_DISCONNECTED";
    public final static String GATT_SERVICES_DISCOVERED =
            "com.networks.teamalexis.healthyliving2.GATT_SERVICES_DISCOVERED";
    public final static String DATA_AVAILABLE =
            "com.networks.teamalexis.healthyliving2.DATA_AVAILABLE";
    public final static String EXTRA =
            "com.networks.teamalexis.healthyliving2.EXTRA";

    public final static UUID UUID_HR_MEASUREMENT =
            UUID.fromString(WearableGATTs.HR_MEASUREMENT);



    public GATTCommService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
