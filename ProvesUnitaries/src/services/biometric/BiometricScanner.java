package services.biometric;

public interface BiometricScanner {
    byte[] scanFace();
    byte[] scanFingerprint();
}
