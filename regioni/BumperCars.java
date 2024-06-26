struct BumperCars{
	int cars=N;
	int persons=0;
}

class BumerCarProblem{

	BumperCars s;
	Queue<Cars> queue= new Queue();

	void Person(){
		region(s){	
			persons++;
			await(cars!=0);
			persons--;
			cars--;
			car=queue.pop();
		}

		drive();

		region(s){
			Car(car);
		}
	}

	void Car(car){
		queue.push(car);
		s.cars++;
	}
}