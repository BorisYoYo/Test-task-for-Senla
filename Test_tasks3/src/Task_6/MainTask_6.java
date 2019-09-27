package Task_6;

import java.util.concurrent.TimeUnit;

public class MainTask_6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		StringBuilder wait = new StringBuilder(" "
				+ "              Открываю сундук...");
		//Немного задержки для красоты :)
		TimeUnit.SECONDS.sleep(1);
		System.out.println(wait);
		TimeUnit.SECONDS.sleep(2);
		System.out.println(wait.replace(0, wait.length(), "                Еще чуть-чуть..."));
		TimeUnit.SECONDS.sleep(2);
		System.out.println(wait.replace(0, wait.length(), "               Посмотрим что тут:\n"));
		TimeUnit.SECONDS.sleep(2);
		
		
		Things all = new Things();
		Bag camping = new Bag(10);
		Chest wooden = new Chest();
		//Закидываем рандомные вещи
		wooden.pool();
		System.out.println("                ПРЕДМЕТЫ В СУНДУКЕ");
		System.out.println("[:::, :::, :::, :::, :::, :::, :::, :::, :::, :::]");
		System.out.println(wooden.chest);
		
		//Еще немного задержки :)
		System.out.println();
		TimeUnit.SECONDS.sleep(4);
		System.out.println(wait.replace(0, wait.length(), "                Места в рюкзаке: " + camping.capacity));
		TimeUnit.SECONDS.sleep(3);
		System.out.println(wait.replace(0, wait.length(), "            Перекладываю вещи в рюкзак..."));
		TimeUnit.SECONDS.sleep(2);
		System.out.println(wait.replace(0, wait.length(), "                   Почти готово..."));
		TimeUnit.SECONDS.sleep(2);
		
		//Оптимально выбыраем вещи по рейтингу и кладем в рюкзак
		all.toBag(camping, wooden);
		System.out.println();
		System.out.println("Вещи в рюкзаке: " + camping.bag.toString());
		System.out.println("Места в рюкзаке осталось: " + camping.capacity);
	
			
	}
}
