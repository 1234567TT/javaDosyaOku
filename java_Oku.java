package b201210597;
import java.util.UUID;
public class beni_oku {
private String motorNo;

public void calistir() {
/**
* calisiyor true yapılıyor
*/
calisiyor = true;
}
/**
* Motorun durdurulması 
*/
public void durdur() {
calisiyor = false;
}
public String getMotorNo() {
// motor no getir
return motorNo;
}
@Override
public String toString() {
// durum belirlenmesi 
String durum = calisiyor ? "Motor Çalışıyor." : "Motor Çalışmıyor";
return durum;
}
}
