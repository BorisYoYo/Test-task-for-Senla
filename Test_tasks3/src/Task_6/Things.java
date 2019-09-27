package Task_6;

public class Things implements Comparable<Things>{
	
	String name;
	int value;
	int weight;
	
	//Конструктор по умолчанию
	Things() {
		
	}
	
	//Конструктор с параметрами вещи
	Things(String name ,int value ,int weight){
		this.name = name;
		this.value = value;
		this.weight = weight;
	}
	
	//Расчет рейтинга вещи
	public int getRate() {
		int rate = value - weight;
		return rate;
	}
	
	//Оптимальное распределение вещей на основе рейтинга
	public void toBag(Bag bag, Chest chest) {
		
		for (Things thing: chest.chest) {
			if (bag.capacity - thing.weight >= 0) {
				bag.capacity -= thing.weight;
				bag.bag.add(thing.name);
			}
		}	
	}
	
	//Условие сортировки объекта Things
	@Override
	public int compareTo(Things thing) {
		if ( this.getRate() == thing.getRate()) {
			return 0;
		} else if (this.getRate() < thing.getRate()) {
			return 1;
		} else {
			return -1;
		}
		
	}
	//Вывод информации о вещах в сундуке
	public String toString() {
		final StringBuffer sb = new StringBuffer();
			sb.append("Предмет:").append(" " + name + " (Ценность: " + value + ", "
						+ "Вес: " + weight + ")");
			System.out.println(sb);
		return ":::";	
	}
}
