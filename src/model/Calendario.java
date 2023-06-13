package model;

public class Calendario {

    private int AnoFixo;
    private int MesFixo;
    private int DiaFixo;
    private int AnoAltera;
    private int MesAltera;
    private int DiaAltera;
    private int TotalDiasMes;
    private int SetDias;

    public Calendario(int AnoFixo, int MesFixo, int DiaFixo, int AnoAltera, int MesAltera, int DiaAltera, int TotalDiasMes, int SetDias) {
        this.AnoFixo = AnoFixo;
        this.MesFixo = MesFixo;
        this.DiaFixo = DiaFixo;
        this.AnoAltera = AnoAltera;
        this.MesAltera = MesAltera;
        this.DiaAltera = DiaAltera;
        this.TotalDiasMes = TotalDiasMes;
        this.SetDias = SetDias;
    }


    public Calendario() {
    }

    public int getAnoFixo() {
        return AnoFixo;
    }

    public void setAnoFixo(int AnoFixo) {
        this.AnoFixo = AnoFixo;
    }

    public int getMesFixo() {
        return MesFixo;
    }

    public void setMesFixo(int MesFixo) {
        this.MesFixo = MesFixo;
    }

    public int getDiaFixo() {
        return DiaFixo;
    }

    public void setDiaFixo(int DiaFixo) {
        this.DiaFixo = DiaFixo;
    }

    public int getAnoAltera() {
        return AnoAltera;
    }

    public void setAnoAltera(int AnoAltera) {
        this.AnoAltera = AnoAltera;
    }

    public int getMesAltera() {
        return MesAltera;
    }

    public void setMesAltera(int MesAltera) {
        this.MesAltera = MesAltera;
    }

    public int getDiaAltera() {
        return DiaAltera;
    }

    public void setDiaAltera(int DiaAltera) {
        this.DiaAltera = DiaAltera;
    }

    public int getTotalDiasMes() {
        return TotalDiasMes;
    }

    public void setTotalDiasMes(int TotalDiasMes) {
        this.TotalDiasMes = TotalDiasMes;
    }

    public int getSetDias() {
        return SetDias;
    }

    public void setSetDias(int SetDias) {
        this.SetDias = SetDias;
    }

}
