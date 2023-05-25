package org.campusmolndal.Helpers;

import org.campusmolndal.Models.Person;

public class Helper {
        public int getDoubleAge(Person person){ return person.getAge() * 2;}
        public int getTripleAge(Person person){ return person.getAge() * 3; }
        public int getCatsAge(Person person) { return person.getAge() * 5;}
        public int getDogYears(Person person){ return person.getAge() * 7; }
        public int getFromCatYears(Person person){ return person.getAge() / 5;}
        public int getFromDogYears(Person person){ return person.getAge() / 7;}
        public int getFromGoldfishYears(Person person){ return person.getAge() * 16;}
        public int getFromHamsterYears(Person person){ return person.getAge() * 27;}
        public int getFromHorseYears(Person person){ return person.getAge() / 2;}
        public int getFromRabbitYears(Person person){ return person.getAge() / 3;}
        public int getGoldfishYears(Person person) { return person.getAge() / 16; }
        public int getHamsterYears(Person person) { return person.getAge() / 27;}
        public int getHorseYears(Person person) { return person.getAge() * 2; }
        public int getRabbitYears(Person person){ return person.getAge() * 3; }
}
