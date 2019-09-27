package Task_6;

import java.util.TreeSet;

public class Chest {
	
	Things apple = new Things("яблоко", 6, 2);
	Things axe = new Things("топор", 5, 4);
	Things banana = new Things("банан", 5, 2);
	Things bbq = new Things("шашлык", 6, 3);
	Things boots = new Things("сапоги", 8, 3);
	Things bottle = new Things("бутылка", 1, 1);
	Things bottle_of_water = new Things("бутылка воды", 10, 2);
	Things bowler_hat = new Things("котелок", 6, 4);
	Things clock = new Things("часы", 2, 1);
	Things fan = new Things("вентилятор", 1, 8);
	Things firts_aid_kit = new Things("аптечка", 10, 3);
	Things fishing_rod = new Things("удочка", 6, 3);
	Things flashlight = new Things("фонарик", 6, 2);
	Things guitar = new Things("гитара", 2, 3);
	Things hammer = new Things("молот", 4, 7);
	Things hunting_bow = new Things("охотничий лук", 8, 4);
	Things knife = new Things("нож", 9, 2);
	Things laptop = new Things("ноутбук", 2, 3);
	Things lighter = new Things("зажигалка", 10, 1);
	Things matches = new Things("спички", 9, 1);
	Things meat = new Things("мясо", 7, 3);
	Things papper = new Things("бумага", 2, 1);
	Things pen = new Things("карандаш", 1, 1);
	Things pineapple = new Things("ананас", 6, 2);
	Things rope = new Things("верёвка", 3, 2);
	Things sandwitch = new Things("бутерброд", 7, 1);
	Things seeds = new Things("семена", 4, 1);
	Things sleeping_bag = new Things("спальный мешок", 7, 6);
	Things soap = new Things("мыло", 2, 2);
	Things stone = new Things("камень", 1, 4);
	Things stool = new Things("табурет", 2, 3);
	Things sword = new Things("меч", 5, 8);
	Things table = new Things("стол", 1, 10);
	Things tent = new Things("палатка", 7, 9);
	Things tomato = new Things("помидор", 6, 1);
	
	//Массив вещей
	Things [] allThings = {knife,apple,axe,banana,bbq,boots,bottle,bottle_of_water,bowler_hat
							, clock,fan,firts_aid_kit,fishing_rod,flashlight,guitar,hammer
							,hunting_bow,laptop,lighter,matches,meat,papper,pen,pineapple,rope
							,sandwitch,seeds,sleeping_bag,soap,stone,stool,sword,table,tent,tomato};
	
	//Массив случайных вещей
	TreeSet<Things> chest = new TreeSet<Things>();
	//Добавление случайной вещи в сундук
	public void pool() {
		while (chest.size() != 10) {
			chest.add(allThings[(int)(Math.random()*allThings.length)]);
		}
	}
}
