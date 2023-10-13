package less6.dz6;

public class Laptop {
   private String manufacturer;
   private String model;
   private Integer ram;
   private Integer hdd;
   private  String operatingSystem;
   private String color;

   public String getManufacturer() {
      return manufacturer;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public Integer getRam() {
      return ram;
   }

   public void setRam(Integer ram) {
      this.ram = ram;
   }

   public Integer getHdd() {
      return hdd;
   }

   public void setHdd(Integer hdd) {
      this.hdd = hdd;
   }

   public String getOperatingSystem() {
      return operatingSystem;
   }

   public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "Производитель: " + manufacturer + ", модель: " + model + ", ОЗУ(гБ): " + ram + ", объем ЖД(гБ): " + hdd +", операционная система: "+ operatingSystem + ", цвет: " + color;
   }


}
