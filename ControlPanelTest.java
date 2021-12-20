class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}
 class Altimeter {
    @Override
  public String toString(){
        System.out.println("Measure height");
      return null;
  }
}

class AirGauge{
  @Override
   public String toString(){
      System.out.println("Measure air pressure");
      return null;
    }
}

class ControlPanel{
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control(){
        altimeter.toString();
        airGauge.toString();
    }
}

