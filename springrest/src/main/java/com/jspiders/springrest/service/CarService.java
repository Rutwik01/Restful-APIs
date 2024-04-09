package com.jspiders.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrest.pojo.Car;
import com.jspiders.springrest.repository.CarRepository;
@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;
	
	public Car addCar(Car car) {
		Car addedCar = carRepository.addCar(car);
		return addedCar;
	}
	
	public List<Car> findAllCars(){
		List<Car> cars = carRepository.findAllCar();
		if (cars != null && cars.size() > 0) {
			return cars;
		} else {
			return null;
		}
	}
	
	public Car deleteCar(int carId, int userId) {
		return carRepository.deleteCar(carId, userId);
	}

	
	public Car updateCar(Car car) {
		Car updatedCar = carRepository.updateCar(car);
		return updatedCar;
	}
}
