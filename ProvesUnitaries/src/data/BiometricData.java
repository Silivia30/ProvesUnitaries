package data;

public class BiometricData {
    private byte[] facial_data;
    private byte[] fingerPrint_data;

    public BiometricData(byte[] facial, byte[] fingerPrint) throws Exception{
        if(facial == null || fingerPrint == null){
            throw new Exception("Invalid facial or fingerprint data on BiometricData().");
        }else{
            this.facial_data = facial;
            this.fingerPrint_data = fingerPrint;
        }
    }

    public byte[] getFacial_data() {
        return this.facial_data;
    }

    public byte[] getFingerPrint_data() {
        return this.fingerPrint_data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiometricData bd = (BiometricData) o;
        return this.facial_data.equals(bd.facial_data) && this.fingerPrint_data.equals(bd.fingerPrint_data);
    }

    @Override
    public String toString() {
        return "BiometricData{" + "facial='" + this.facial_data + '\'' + ", fingerprint='" + this.fingerPrint_data + '\'' +'}';
    }
}
