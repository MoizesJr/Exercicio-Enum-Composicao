package entities;

import javax.xml.crypto.Data;

public class HourContract {

  private Data date;
  private Double valuePerHour;
  private Integer hours;

  public HourContract() {

  }

  public HourContract(Data date, Double valuePerHour, Integer hours) {
    this.date = date;
    this.valuePerHour = valuePerHour;
    this.hours = hours;
  }

  public double totalValue() {
    return this.getHours() * this.getValuePerHour();
  }

  public Data getDate() {
    return date;
  }

  public void setDate(Data date) {
    this.date = date;
  }

  public Double getValuePerHour() {
    return valuePerHour;
  }

  public void setValuePerHour(Double valuePerHour) {
    this.valuePerHour = valuePerHour;
  }

  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

}
