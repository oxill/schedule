package schedule;

import java.io.IOException;

/**
 * Created by Ilya on 31.08.2016.
 */
public class Schedule {
    public static void main(String[] args) throws IOException {                                      
        Class class1a = new Class(1, "А", 27);
        Class class1b = new Class(1, "Б", 25);        
        Class class2a = new Class(2, "А", 27);
        Class class2b = new Class(2, "Б", 25);
        Class class2v = new Class(2, "В", 25);        
        Class class3a = new Class(3, "А", 27);
        Class class3b = new Class(3, "Б", 25);        
        Class class4a = new Class(4, "А", 27);
        Class class4b = new Class(4, "Б", 25);
        Class class4v = new Class(4, "В", 25);        
        Class class5a = new Class(5, "А", 27);
        Class class5b = new Class(5, "Б", 25);        
        Class class5v = new Class(5, "В", 25);        
        Class class6a = new Class(6, "А", 27);
        Class class6b = new Class(6, "Б", 25);        
        Class class7a = new Class(7, "А", 27);
        Class class7b = new Class(7, "Б", 25);        
        Class class8a = new Class(8, "А", 27);
        Class class8b = new Class(8, "Б", 25);        
        Class class9a = new Class(9, "А", 25);
        Class class9b = new Class(9, "Б", 25);
        Class class9v = new Class(9, "В", 25);        
        Class class10a = new Class(10, "А", 27);        
        Class class11a = new Class(11, "А", 27);                
                
        /*Mixer.addClass(class1a);
        Mixer.addClass(class1b);        
        Mixer.addClass(class2a);
        Mixer.addClass(class2b);
        Mixer.addClass(class2v);        
        Mixer.addClass(class3a);
        Mixer.addClass(class3b);        
        Mixer.addClass(class4a);
        Mixer.addClass(class4b);
        Mixer.addClass(class4v); */       
        Mixer.addClass(class5a);
        Mixer.addClass(class5b);        
        Mixer.addClass(class6a);
        Mixer.addClass(class6b);        
        Mixer.addClass(class7a);
        Mixer.addClass(class7b);        
        Mixer.addClass(class8a);
        Mixer.addClass(class8b);        
        Mixer.addClass(class9a);
        Mixer.addClass(class9b);
        Mixer.addClass(class9v);        
        Mixer.addClass(class10a);        
        Mixer.addClass(class11a);
                
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 6, 5);
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 6, 6);
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 6, 7);
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 6, 8);
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 5, 9);
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 7, 10);
        Mixer.addClassessLesson(Lessons.MATHEMATICS, 5, 11);
        
        Mixer.addClassessLesson(Lessons.RUSSIAN, 6, 5);
        Mixer.addClassessLesson(Lessons.RUSSIAN, 6, 6);
        Mixer.addClassessLesson(Lessons.RUSSIAN, 5, 7);
        Mixer.addClassessLesson(Lessons.RUSSIAN, 3, 8);
        Mixer.addClassessLesson(Lessons.RUSSIAN, 2, 9);
        Mixer.addClassessLesson(Lessons.RUSSIAN, 1, 10);
        Mixer.addClassessLesson(Lessons.RUSSIAN, 1, 11);
        
        Mixer.addClassessLesson(Lessons.LITERATURE, 3, 5);
        Mixer.addClassessLesson(Lessons.LITERATURE, 3, 6);
        Mixer.addClassessLesson(Lessons.LITERATURE, 2, 7);
        Mixer.addClassessLesson(Lessons.LITERATURE, 2, 8);
        Mixer.addClassessLesson(Lessons.LITERATURE, 3, 9);
        Mixer.addClassessLesson(Lessons.LITERATURE, 3, 10);
        Mixer.addClassessLesson(Lessons.LITERATURE, 3, 11);
        
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 5);
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 6);
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 7);
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 8);
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 9);
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 10);
        Mixer.addClassessLesson(Lessons.HISTORY, 2, 11);
        
        Mixer.addClassessLesson(Lessons.SOCIAL, 1, 5);
        Mixer.addClassessLesson(Lessons.SOCIAL, 1, 6);
        Mixer.addClassessLesson(Lessons.SOCIAL, 1, 7);
        Mixer.addClassessLesson(Lessons.SOCIAL, 1, 8);
        Mixer.addClassessLesson(Lessons.SOCIAL, 1, 9);
        Mixer.addClassessLesson(Lessons.SOCIAL, 2, 10);
        Mixer.addClassessLesson(Lessons.SOCIAL, 2, 11);
        
        
        
        Mixer.addClassessLesson(Lessons.INFORMATICS, 2, 6);
        Mixer.addClassessLesson(Lessons.INFORMATICS, 2, 7);
        Mixer.addClassessLesson(Lessons.INFORMATICS, 2, 8);
        Mixer.addClassessLesson(Lessons.INFORMATICS, 4, 9);
        Mixer.addClassessLesson(Lessons.INFORMATICS, 1, 10);
        Mixer.addClassessLesson(Lessons.INFORMATICS, 1, 11);
        
        Mixer.addClassessLesson(Lessons.PHYSICS, 2, 7);
        Mixer.addClassessLesson(Lessons.PHYSICS, 3, 8);
        Mixer.addClassessLesson(Lessons.PHYSICS, 2, 9);
        Mixer.addClassessLesson(Lessons.PHYSICS, 2, 10);
        Mixer.addClassessLesson(Lessons.PHYSICS, 2, 11);
        
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 4, 5);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 6);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 7);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 8);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 9);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 10);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 11);
        
        /*Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 4, 5);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 6);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 7);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 8);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 2, 9);
        Mixer.addClassessLesson(Lessons.FOREIGN_LANGUAGE, 3, 10);*/
        
        Mixer.addClassessLesson(Lessons.CHEMISTRY, 2, 8);
        Mixer.addClassessLesson(Lessons.CHEMISTRY, 2, 9);
        Mixer.addClassessLesson(Lessons.CHEMISTRY, 1, 10);
        Mixer.addClassessLesson(Lessons.CHEMISTRY, 1, 11);
        
        Mixer.addClassessLesson(Lessons.BIOLOGY, 1, 5);
        Mixer.addClassessLesson(Lessons.BIOLOGY, 1, 6);
        Mixer.addClassessLesson(Lessons.BIOLOGY, 2, 7);
        Mixer.addClassessLesson(Lessons.BIOLOGY, 2, 8);
        Mixer.addClassessLesson(Lessons.BIOLOGY, 2, 9);
        Mixer.addClassessLesson(Lessons.BIOLOGY, 1, 10);
        Mixer.addClassessLesson(Lessons.BIOLOGY, 1, 11);
        
        Mixer.addClassessLesson(Lessons.ECOLOGY, 1, 6);
        Mixer.addClassessLesson(Lessons.ECOLOGY, 1, 7);
        Mixer.addClassessLesson(Lessons.ECOLOGY, 1, 8);
        Mixer.addClassessLesson(Lessons.ECOLOGY, 1, 9);
        
        
        Mixer.addClassessLesson(Lessons.TECHNOLOGY, 2, 5);
        Mixer.addClassessLesson(Lessons.TECHNOLOGY, 2, 6);
        Mixer.addClassessLesson(Lessons.TECHNOLOGY, 2, 7);
        Mixer.addClassessLesson(Lessons.TECHNOLOGY, 1, 8);
        //Mixer.addClassessLesson(Lessons.TECHNOLOGY, 1, 9);
        Mixer.addClassessLesson(Lessons.TECHNOLOGY, 1, 10);
        Mixer.addClassessLesson(Lessons.TECHNOLOGY, 1, 11);
        
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 1, 5);
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 1, 6);
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 2, 7);
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 2, 8);
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 2, 9);
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 1, 10);
        Mixer.addClassessLesson(Lessons.GEOGRAPHY, 1, 11);
        
        Mixer.addClassessLesson(Lessons.ART, 1, 5);
        Mixer.addClassessLesson(Lessons.ART, 1, 6);
        Mixer.addClassessLesson(Lessons.ART, 1, 7);
        Mixer.addClassessLesson(Lessons.ART, 1, 8);//0.5
        Mixer.addClassessLesson(Lessons.ART, 1, 9);//0.5
        
        Mixer.addClassessLesson(Lessons.MUSIK, 1, 5);
        Mixer.addClassessLesson(Lessons.MUSIK, 1, 6);
        Mixer.addClassessLesson(Lessons.MUSIK, 1, 7);
        Mixer.addClassessLesson(Lessons.MUSIK, 1, 8);//0.5
        Mixer.addClassessLesson(Lessons.MUSIK, 1, 9);//0.5
                
        Mixer.addClassessLesson(Lessons.OBZH, 1, 8);
        Mixer.addClassessLesson(Lessons.OBZH, 1, 9);
        Mixer.addClassessLesson(Lessons.OBZH, 1, 10);
        Mixer.addClassessLesson(Lessons.OBZH, 1, 11);
        
        Mixer.addClassessLesson(Lessons.SPORT, 3, 5);
        Mixer.addClassessLesson(Lessons.SPORT, 3, 6);
        Mixer.addClassessLesson(Lessons.SPORT, 3, 7);
        Mixer.addClassessLesson(Lessons.SPORT, 3, 8);
        Mixer.addClassessLesson(Lessons.SPORT, 3, 9);
        Mixer.addClassessLesson(Lessons.SPORT, 3, 10);
        Mixer.addClassessLesson(Lessons.SPORT, 3, 11);
        
        Mixer.addClassessLesson(Lessons.ZOZH, 1, 8);
        Mixer.addClassessLesson(Lessons.ZOZH, 1, 9);
        
        Teacher shurupova = new Teacher("Шурупова");
        Teacher medvedeva = new Teacher("Медведева");
        Teacher baboshkina = new Teacher("Бабошкина");
        Teacher tulumbasova = new Teacher("Тулумбасова");
        Teacher donec = new Teacher("Донец");
        Teacher danilina = new Teacher("Данилина");
        Teacher fenina = new Teacher("Фенина");
        Teacher andryan = new Teacher("Андрян");
        Teacher fokina = new Teacher("Фокина");
        Teacher lamihova = new Teacher("Ламихова");
        Teacher nikishina = new Teacher("Никишина");
        Teacher ugulava = new Teacher("Угулава");
        Teacher dudina = new Teacher("Дудина");
        Teacher yakobson = new Teacher("Якобсон");
        Teacher koroleva = new Teacher("Королева");
        Teacher gorobec = new Teacher("Горобец");
        Teacher chernishova = new Teacher("Чернышева");
        Teacher aleksandrova = new Teacher("Александрова");
        Teacher mishanova = new Teacher("Мишанова");
        Teacher rogacheva = new Teacher("Рогачева");
        Teacher torbina = new Teacher("Торбина");
        Teacher semenova = new Teacher("Семенова");
        Teacher zhuravleva = new Teacher("Журавлева");
        Teacher isaenko = new Teacher("Исаенко");
        Teacher usacheva = new Teacher("Усачева");
        Teacher gvozdeva = new Teacher("Гвоздева");
        Teacher zvyagin = new Teacher("Звягин");
        
        shurupova.addLessonHardCode(Lessons.MATHEMATICS, class9a);
        shurupova.addLessonHardCode(Lessons.MATHEMATICS, class9v);
        shurupova.addLessonHardCode(Lessons.MATHEMATICS, class11a);
        shurupova.addLessonHardCode(Lessons.TECHNOLOGY, class6b);
        
        medvedeva.addLessonHardCode(Lessons.MATHEMATICS, class6a);
        medvedeva.addLessonHardCode(Lessons.MATHEMATICS, class8a);
        medvedeva.addLessonHardCode(Lessons.MATHEMATICS, class9b);
        medvedeva.addLessonHardCode(Lessons.TECHNOLOGY, class6a);
        
        baboshkina.addLessonHardCode(Lessons.MATHEMATICS, class7a);
        baboshkina.addLessonHardCode(Lessons.MATHEMATICS, class7b);
        baboshkina.addLessonHardCode(Lessons.MATHEMATICS, class5a);
        baboshkina.addLessonHardCode(Lessons.MATHEMATICS, class5b);
        
        tulumbasova.addLessonHardCode(Lessons.MATHEMATICS, class6b);
        tulumbasova.addLessonHardCode(Lessons.MATHEMATICS, class8b);
        tulumbasova.addLessonHardCode(Lessons.MATHEMATICS, class10a);
        
        donec.addLessonHardCode(Lessons.RUSSIAN, class5a);
        donec.addLessonHardCode(Lessons.RUSSIAN, class5b);
        donec.addLessonHardCode(Lessons.LITERATURE, class5a);
        donec.addLessonHardCode(Lessons.LITERATURE, class5b);
        
        danilina.addLessonHardCode(Lessons.RUSSIAN, class7a);
        danilina.addLessonHardCode(Lessons.RUSSIAN, class9a);
        danilina.addLessonHardCode(Lessons.RUSSIAN, class11a);
        danilina.addLessonHardCode(Lessons.LITERATURE, class7a);
        danilina.addLessonHardCode(Lessons.LITERATURE, class9a);
        danilina.addLessonHardCode(Lessons.LITERATURE, class11a);
        
        fenina.addLessonHardCode(Lessons.RUSSIAN, class8a);
        fenina.addLessonHardCode(Lessons.RUSSIAN, class8b);
        fenina.addLessonHardCode(Lessons.RUSSIAN, class10a);
        fenina.addLessonHardCode(Lessons.LITERATURE, class8a);
        fenina.addLessonHardCode(Lessons.LITERATURE, class8b);
        fenina.addLessonHardCode(Lessons.LITERATURE, class10a);
        
        
        andryan.addLessonHardCode(Lessons.RUSSIAN, class6a);
        andryan.addLessonHardCode(Lessons.RUSSIAN, class7b);       
        andryan.addLessonHardCode(Lessons.LITERATURE, class6a);
        andryan.addLessonHardCode(Lessons.LITERATURE, class7b);
        
        fokina.addLessonHardCode(Lessons.RUSSIAN, class6b);
        fokina.addLessonHardCode(Lessons.RUSSIAN, class9b);
        fokina.addLessonHardCode(Lessons.RUSSIAN, class9v);
        fokina.addLessonHardCode(Lessons.LITERATURE, class6b);
        fokina.addLessonHardCode(Lessons.LITERATURE, class9b);
        fokina.addLessonHardCode(Lessons.LITERATURE, class9v);
        
        lamihova.addLessonHardCode(Lessons.HISTORY, class6a);
        lamihova.addLessonHardCode(Lessons.HISTORY, class6b);
        lamihova.addLessonHardCode(Lessons.HISTORY, class7a);
        lamihova.addLessonHardCode(Lessons.HISTORY, class7b);
        lamihova.addLessonHardCode(Lessons.HISTORY, class8a);
        lamihova.addLessonHardCode(Lessons.HISTORY, class8b);
        lamihova.addLessonHardCode(Lessons.HISTORY, class11a);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class6a);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class6b);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class7a);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class7b);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class8a);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class8b);
        lamihova.addLessonHardCode(Lessons.SOCIAL, class11a);
                
        nikishina.addLessonHardCode(Lessons.HISTORY, class5a);
        nikishina.addLessonHardCode(Lessons.HISTORY, class5b);
        nikishina.addLessonHardCode(Lessons.HISTORY, class9a);
        nikishina.addLessonHardCode(Lessons.HISTORY, class9b);
        nikishina.addLessonHardCode(Lessons.HISTORY, class9v);
        nikishina.addLessonHardCode(Lessons.HISTORY, class10a);
        nikishina.addLessonHardCode(Lessons.SOCIAL, class5a);
        nikishina.addLessonHardCode(Lessons.SOCIAL, class5b);
        nikishina.addLessonHardCode(Lessons.SOCIAL, class9a);
        nikishina.addLessonHardCode(Lessons.SOCIAL, class9b);
        nikishina.addLessonHardCode(Lessons.SOCIAL, class9v);
        nikishina.addLessonHardCode(Lessons.SOCIAL, class10a);
        nikishina.addLessonHardCode(Lessons.GEOGRAPHY, class10a);
        nikishina.addLessonHardCode(Lessons.GEOGRAPHY, class11a);
        
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class6a);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class6b);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class7a);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class7b);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class8a);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class8b);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class9a);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class9b);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class9v);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class10a);
        ugulava.addLessonHardCode(Lessons.INFORMATICS, class11a);
                
        dudina.addLessonHardCode(Lessons.PHYSICS, class7a);
        dudina.addLessonHardCode(Lessons.PHYSICS, class7b);
        dudina.addLessonHardCode(Lessons.PHYSICS, class8a);
        dudina.addLessonHardCode(Lessons.PHYSICS, class8b);
        dudina.addLessonHardCode(Lessons.PHYSICS, class9a);
        dudina.addLessonHardCode(Lessons.PHYSICS, class9b);
        dudina.addLessonHardCode(Lessons.PHYSICS, class9v);
        dudina.addLessonHardCode(Lessons.PHYSICS, class10a);
        dudina.addLessonHardCode(Lessons.PHYSICS, class11a);
        
        yakobson.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class5a);
        yakobson.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class7a);
        yakobson.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class7b);
        yakobson.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class8a);
        yakobson.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class9a);
        yakobson.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class9v);
        
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class5b);
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class6a);
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class6b);
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class8b);
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class9b);
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class10a);
        koroleva.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class11a);
                
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class7a);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class7b);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class8a);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class8b);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class9a);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class9b);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class9v);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class10a);
        gorobec.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class11a);
        
        chernishova.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class5a);
        chernishova.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class5b);
        chernishova.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class6a);
        chernishova.addLessonHardCode(Lessons.FOREIGN_LANGUAGE, class6b);
        
        aleksandrova.addLessonHardCode(Lessons.CHEMISTRY, class8a);
        aleksandrova.addLessonHardCode(Lessons.CHEMISTRY, class8b);
        aleksandrova.addLessonHardCode(Lessons.CHEMISTRY, class9v);
        aleksandrova.addLessonHardCode(Lessons.CHEMISTRY, class10a);
        aleksandrova.addLessonHardCode(Lessons.BIOLOGY, class6a);
        aleksandrova.addLessonHardCode(Lessons.BIOLOGY, class6b);
        aleksandrova.addLessonHardCode(Lessons.BIOLOGY, class9v);
        aleksandrova.addLessonHardCode(Lessons.BIOLOGY, class10a);
        aleksandrova.addLessonHardCode(Lessons.ECOLOGY, class6a);
        aleksandrova.addLessonHardCode(Lessons.ECOLOGY, class6b);
        aleksandrova.addLessonHardCode(Lessons.ECOLOGY, class9v);
        aleksandrova.addLessonHardCode(Lessons.ZOZH, class8a);
        aleksandrova.addLessonHardCode(Lessons.ZOZH, class8b);
        
        
        
        mishanova.addLessonHardCode(Lessons.BIOLOGY, class5a);
        mishanova.addLessonHardCode(Lessons.BIOLOGY, class5b);
        mishanova.addLessonHardCode(Lessons.BIOLOGY, class7a);
        mishanova.addLessonHardCode(Lessons.BIOLOGY, class7b);
        mishanova.addLessonHardCode(Lessons.BIOLOGY, class8a);
        mishanova.addLessonHardCode(Lessons.BIOLOGY, class8b);
        mishanova.addLessonHardCode(Lessons.ECOLOGY, class7a);
        mishanova.addLessonHardCode(Lessons.ECOLOGY, class7b);
        mishanova.addLessonHardCode(Lessons.ECOLOGY, class8a);
        mishanova.addLessonHardCode(Lessons.ECOLOGY, class8b);
        mishanova.addLessonHardCode(Lessons.TECHNOLOGY, class8a);
        mishanova.addLessonHardCode(Lessons.TECHNOLOGY, class8b);
        mishanova.addLessonHardCode(Lessons.GEOGRAPHY, class8a);
        mishanova.addLessonHardCode(Lessons.GEOGRAPHY, class8b);
        mishanova.addLessonHardCode(Lessons.GEOGRAPHY, class9a);
        mishanova.addLessonHardCode(Lessons.GEOGRAPHY, class9b);
        mishanova.addLessonHardCode(Lessons.GEOGRAPHY, class9v);                
        
        rogacheva.addLessonHardCode(Lessons.CHEMISTRY, class9a);
        rogacheva.addLessonHardCode(Lessons.CHEMISTRY, class9b);
        rogacheva.addLessonHardCode(Lessons.CHEMISTRY, class11a);
        rogacheva.addLessonHardCode(Lessons.ZOZH, class9a);
        rogacheva.addLessonHardCode(Lessons.ZOZH, class9b);
        rogacheva.addLessonHardCode(Lessons.ZOZH, class9v);
        
        torbina.addLessonHardCode(Lessons.BIOLOGY, class9a);
        torbina.addLessonHardCode(Lessons.BIOLOGY, class9b);
        torbina.addLessonHardCode(Lessons.BIOLOGY, class11a);
        torbina.addLessonHardCode(Lessons.ECOLOGY, class9a);
        torbina.addLessonHardCode(Lessons.ECOLOGY, class9b);
        torbina.addLessonHardCode(Lessons.TECHNOLOGY, class5a);
        torbina.addLessonHardCode(Lessons.TECHNOLOGY, class5b);
        torbina.addLessonHardCode(Lessons.TECHNOLOGY, class7a);
        torbina.addLessonHardCode(Lessons.TECHNOLOGY, class7b);
        torbina.addLessonHardCode(Lessons.TECHNOLOGY, class10a);
        torbina.addLessonHardCode(Lessons.TECHNOLOGY, class11a);
        torbina.addLessonHardCode(Lessons.GEOGRAPHY, class5a);
        torbina.addLessonHardCode(Lessons.GEOGRAPHY, class5b);
        torbina.addLessonHardCode(Lessons.GEOGRAPHY, class6a);
        torbina.addLessonHardCode(Lessons.GEOGRAPHY, class6b);
        torbina.addLessonHardCode(Lessons.GEOGRAPHY, class7a);
        torbina.addLessonHardCode(Lessons.GEOGRAPHY, class7b);
        
        semenova.addLessonHardCode(Lessons.ART, class5a);
        semenova.addLessonHardCode(Lessons.ART, class5b);
        semenova.addLessonHardCode(Lessons.ART, class6a);
        semenova.addLessonHardCode(Lessons.ART, class6b);
        semenova.addLessonHardCode(Lessons.ART, class7a);
        semenova.addLessonHardCode(Lessons.ART, class7b);
        semenova.addLessonHardCode(Lessons.ART, class8a);
        semenova.addLessonHardCode(Lessons.ART, class8b);
        semenova.addLessonHardCode(Lessons.ART, class9a);
        semenova.addLessonHardCode(Lessons.ART, class9b);
        semenova.addLessonHardCode(Lessons.ART, class9v);
        
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class5a);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class5b);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class6a);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class6b);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class7a);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class7b);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class8a);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class8b);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class9a);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class9b);
        zhuravleva.addLessonHardCode(Lessons.MUSIK, class9v);
        
        isaenko.addLessonHardCode(Lessons.OBZH, class8a);
        isaenko.addLessonHardCode(Lessons.OBZH, class8b);
        isaenko.addLessonHardCode(Lessons.OBZH, class9a);
        isaenko.addLessonHardCode(Lessons.OBZH, class9b);
        isaenko.addLessonHardCode(Lessons.OBZH, class9v);
        isaenko.addLessonHardCode(Lessons.OBZH, class10a);
        isaenko.addLessonHardCode(Lessons.OBZH, class11a);
        /*isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class5a);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class5b);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class6a);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class6b);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class7a);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class7b);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class8a);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class8b);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class9a);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class9b);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class9v);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class10a);
        isaenko.addLessonHardCode(Lessons.TECHNOLOGY, class11a);*/
        
        usacheva.addLessonHardCode(Lessons.SPORT, class6a);
        usacheva.addLessonHardCode(Lessons.SPORT, class6b);
        usacheva.addLessonHardCode(Lessons.SPORT, class7a);
        usacheva.addLessonHardCode(Lessons.SPORT, class7b);
        usacheva.addLessonHardCode(Lessons.SPORT, class8a);
        usacheva.addLessonHardCode(Lessons.SPORT, class8b);
        usacheva.addLessonHardCode(Lessons.SPORT, class10a);
        usacheva.addLessonHardCode(Lessons.SPORT, class11a);
        
        gvozdeva.addLessonHardCode(Lessons.SPORT, class9b);
        
        zvyagin.addLessonHardCode(Lessons.SPORT, class5a);
        zvyagin.addLessonHardCode(Lessons.SPORT, class5b);
        zvyagin.addLessonHardCode(Lessons.SPORT, class9a);
        zvyagin.addLessonHardCode(Lessons.SPORT, class9v);
              
   
        
        Mixer.addTeacher(shurupova);
        Mixer.addTeacher(medvedeva);        
        Mixer.addTeacher(baboshkina);
        Mixer.addTeacher(tulumbasova);
        Mixer.addTeacher(donec);        
        Mixer.addTeacher(danilina);
        Mixer.addTeacher(fenina);
        Mixer.addTeacher(andryan);        
        Mixer.addTeacher(fokina);
        Mixer.addTeacher(lamihova);
        Mixer.addTeacher(nikishina);        
        Mixer.addTeacher(ugulava);        
        Mixer.addTeacher(dudina);
        Mixer.addTeacher(yakobson);        
        Mixer.addTeacher(koroleva);
        Mixer.addTeacher(gorobec);
        Mixer.addTeacher(chernishova);        
        Mixer.addTeacher(aleksandrova);
        Mixer.addTeacher(mishanova);
        Mixer.addTeacher(rogacheva);        
        Mixer.addTeacher(torbina);
        Mixer.addTeacher(semenova);
        Mixer.addTeacher(zhuravleva);        
        Mixer.addTeacher(isaenko);
        Mixer.addTeacher(usacheva);        
        Mixer.addTeacher(gvozdeva);
        Mixer.addTeacher(zvyagin);
                        
        Mixer.createTeachersFreeDay(Lessons.MATHEMATICS, DayOfWeek.MONDAY);
        Mixer.createTeachersFreeDay(Lessons.INFORMATICS, DayOfWeek.MONDAY);
        Mixer.createTeachersFreeDay(Lessons.BIOLOGY, DayOfWeek.TUESDAY);
        Mixer.createTeachersFreeDay(Lessons.CHEMISTRY, DayOfWeek.TUESDAY);
        Mixer.createTeachersFreeDay(Lessons.FOREIGN_LANGUAGE, DayOfWeek.WEDNESDAY);
        Mixer.createTeachersFreeDay(Lessons.FOREIGN_LANGUAGE, DayOfWeek.WEDNESDAY);
        Mixer.createTeachersFreeDay(Lessons.HISTORY, DayOfWeek.WEDNESDAY);
        Mixer.createTeachersFreeDay(Lessons.PHYSICS, DayOfWeek.THURSDAY);
        Mixer.createTeachersFreeDay(Lessons.SPORT, DayOfWeek.THURSDAY);
        Mixer.createTeachersFreeDay(Lessons.LITERATURE, DayOfWeek.FRIDAY);
        Mixer.createTeachersFreeDay(Lessons.RUSSIAN, DayOfWeek.FRIDAY);
        Mixer.createTeachersFreeDay(Lessons.MUSIK, DayOfWeek.FRIDAY);
        Mixer.createTeachersFreeDay(Lessons.OBZH, DayOfWeek.FRIDAY);
                                
        Mixer.showFreeDay();
        
        Mixer.showTeachersLessonsLoad();
        Mixer.showClassesLessonsLoad();            
        
        Mixer.showTeachersWeekLoad();
        Mixer.showClassesWeekLoad();
        
        Mixer.createSchedule();
        System.out.println("------");
        Mixer.showTeachersWeekLoad();
        Mixer.showClassesWeekLoad();
        
        Mixer.showTeachersLessonsLoad();
        Mixer.showClassesLessonsLoad();            
    }
}
/*Исаенко Week and list
MONDAY 0 0 11А 0 9В 6А 
TUESDAY 0 0 0 0 9А 5А 
WEDNESDAY 0 0 0 0 7А 8А 
THURSDAY 0 0 0 8Б 9Б 
SATURDAY 0 0 0 0 10А 8Б */