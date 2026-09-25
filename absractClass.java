public class absractClass {
    /*
    1--abstract classes do no have object
    2--we make absract classes to implements abstraction
    3--separating what and how from a method is known as abstraction
    4--we used absract classes and infaces to acheive abstraction
    5--there are two level of abstraction i.e low level and high level
     */
    public static void main(String[] args) {
        animal a = new Cat();
        a.eat();
        a.sleep();
        a.walk();


        animal b = new Dog();
        b.eat();
    }
}

    abstract class animal {
        abstract void eat();

        abstract void sleep();

        abstract void walk();
        final int age = 23;
    }

    class Cat extends animal {
        void eat() {
            System.out.println("cat eats");
        }

        void sleep() {
            System.out.println("cat sleeps");
        }

        void walk() {
            System.out.println("cat walks");
        }
    }

    class Dog extends animal {
        @Override
        void eat() {
            System.out.println("dog eats bones");
        }

        @Override
        void sleep() {
            System.out.println("Dogs sleep");
        }

        @Override
        void walk() {
            System.out.println("cat walks");
        }
    }

    class Fish extends animal {
        @Override
        void eat() {
            System.out.println("fish eats in the occeans");
        }

        @Override
        void sleep() {
            System.out.println("fish sleeps during night");
        }

        @Override
        void walk() {
            System.out.println("fish swim in the occeans");
        }
    }

    class panda extends animal {
        @Override
        void eat() {
            System.out.println("panda eats ");
        }

        @Override
        void sleep() {
            System.out.println("panda sleeps");
        }

        @Override
        void walk() {
            System.out.println("panda walks");
        }
    }


/*
 ******************************************************------------------------interview questions-------------------***********************************
 * ---can  a abstarct class be final--------------> no
 * ---can a abstract class be static ------------->yes
 * ---can a abstract class have final variables/methods---yes
 * can a abstract class have constructor ---->yes
 */
