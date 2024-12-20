package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entitiesEnum.WorkerLevel;

public class Worker {

  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker() {

  }

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public void addContract(HourContract contract) {
    contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

  public Double income(Integer year, Integer month) {
    double sum = baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HourContract hourContract : contracts) {
      cal.setTime(hourContract.getDate());
      int c_year = cal.get(Calendar.YEAR);
      int c_month = cal.get(Calendar.MONTH);
      if (year == c_year && month == c_month) {
        sum += hourContract.totalValue();
      }
    }
    return sum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

}
