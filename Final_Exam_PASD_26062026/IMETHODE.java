
package Final_Exam_PASD_26062026;

public class IMETHODE {
    IPASD ndas = null;
    IPASD buntut = null;
    
    void nambahI_anyar(ITEM I_anyar) {
        IPASD newIPASD = new IPASD(I_anyar);
        if (ndas == null) {
            ndas = newIPASD;
            buntut = newIPASD;
        } else {
            buntut.kiwo = newIPASD;
            newIPASD.tengen = buntut;
            buntut = newIPASD;
        }
    }
    
    ITEM golekbarang(String golekkode) {
        IPASD sementaun = ndas;
        while (sementaun != null) {
            if (sementaun.data.itemCode.equalsIgnoreCase(golekkode)) {
                return sementaun.data;
            }
            sementaun = sementaun.kiwo;
        }
        return null;
    }
}
