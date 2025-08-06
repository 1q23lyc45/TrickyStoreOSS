/*
 * Copyright 2025 Dakkshesh <beakthoven@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package android.security.keystore;

import android.os.IBinder;
import android.os.RemoteException;
import android.security.keymaster.KeymasterCertificateChain;

public interface IKeystoreCertificateChainCallback {
    void onFinished(KeystoreResponse keystoreResponse, KeymasterCertificateChain keymasterCertificateChain)
            throws RemoteException;

    public static abstract class Stub {
        public static IKeystoreCertificateChainCallback asInterface(IBinder b) {
            throw new RuntimeException("");
        }
    }
}
