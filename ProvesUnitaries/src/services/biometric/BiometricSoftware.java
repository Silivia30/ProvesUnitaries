package services.biometric;

import data.BiometricData;
import exceptions.BiometricVerificationFailedException;

public interface BiometricSoftware {
    void verifyBiometricData(BiometricData scanned_data, BiometricData readed_data) throws BiometricVerificationFailedException;
}
