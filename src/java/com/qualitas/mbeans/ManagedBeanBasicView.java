
package com.qualitas.mbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.qualitas.mbeans.Car;
import com.qualitas.mbeans.CarService;


public class ManagedBeanBasicView implements Serializable {
  private List<Car> cars;
  @ManagedProperty("#{carService}")
  private CarService service;
  
  @PostConstruct
  public void init() {
      cars = service.createCars(10);
  }
  public List<Car> getCars() {
      return cars;
  }
  
  public void setService(CarService service) {
      this.service = service;
  }  
    
    
}
