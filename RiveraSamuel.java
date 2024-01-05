public class RiveraSamuel extends Animal
{
  // instance variables - replace the example below with your own
  private String color;
  private int legs;
  private String studentName;
  private String type;
  private String speak;
  private String name;
  private String disposition;
  /**
   * Constructor
   */
  public RiveraSamuel() {
    this.studentName = "RiveraSamuel";
    this.color = "Brown";
    this.legs = 4;
    this.type = "weinerdog";
    this.speak = "ween ween ween";
    this.name = "richard";
    this.disposition = " exitable";
  }
   public String speak() {
    return this.speak;
  }
   public String getStudentName() {
    return this.studentName;
  }
  public void setSpeak(){
      if(this.disposition.equals("exitable")){
          this.speak = "ween ween ween";
      }
  }
  public String getDisposition() {
    return this.disposition;
  }
  public String getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }
  
}
