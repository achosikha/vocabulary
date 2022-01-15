package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private String [][] myLatin = new String [133][5];

    void initializeMyArray(){
            myLatin[0][0] = "Barbarus";
            myLatin[0][1] = "Варвар";

            myLatin[1][0] = "Captere";
            myLatin[1][1] = "Capto";
            myLatin[1][2] = "Captivi";
            myLatin[1][3] = "Captum";
            myLatin[1][4] = "Ловить";

            myLatin[2][0] = "Credere";
            myLatin[2][1] = "Credo";
            myLatin[2][2] = "Credidi";
            myLatin[2][3] = "Creditum";
            myLatin[2][4] = "Верить";

            myLatin[3][0] = "Clamare";
            myLatin[3][1] = "Clamo";
            myLatin[3][2] = "Clamavi";
            myLatin[3][3] = "Clamatum";
            myLatin[3][4] = "Кричать";

            myLatin[4][0] = "Tacere";
            myLatin[4][1] = "Taceo";
            myLatin[4][2] = "Tacui";
            myLatin[4][3] = "Tacitum";
            myLatin[4][4] = "Молчать";

            myLatin[5][0] = "Laudare";
            myLatin[5][1] = "Laudo";
            myLatin[5][2] = "Laudavi";
            myLatin[5][3] = "Laudatum";
            myLatin[5][4] = "Хвалить";

            myLatin[6][0] = "Debere";
            myLatin[6][1] = "Debeo";
            myLatin[6][2] = "Debui";
            myLatin[6][3] = "Debitum";
            myLatin[6][4] = "Быть обязанным, должным";

            myLatin[7][0] = "Monereo";
            myLatin[7][1] = "Mone";
            myLatin[7][2] = "Monui";
            myLatin[7][3] = "Monitum";
            myLatin[7][4] = "Увещевать, уговаривать";

            myLatin[8][0] = "Florere";
            myLatin[8][1] = "Floreo";
            myLatin[8][2] = "Florui";
            myLatin[8][3] = "N/A";
            myLatin[8][4] = "Цвести, быть в расцвете";

            myLatin[9][0] = "Horrere";
            myLatin[9][1] = "Horreo";
            myLatin[9][2] = "Horrui";
            myLatin[9][3] = "N/A";
            myLatin[9][4] = "Страшиться";

            myLatin[10][0] = "Scribere";
            myLatin[10][1] = "Scribo";
            myLatin[10][2] = "Scripsi";
            myLatin[10][3] = "Scriptum";
            myLatin[10][4] = "Писать";

            myLatin[11][0] = "Mittere";
            myLatin[11][1] = "Mitto";
            myLatin[11][2] = "Misi";
            myLatin[11][3] = "Missum";
            myLatin[11][4] = "Посылать";

            myLatin[12][0] = "Legere";
            myLatin[12][1] = "Lego";
            myLatin[12][2] = "Legi";
            myLatin[12][3] = "Lectum";
            myLatin[12][4] = "Читать";

            myLatin[13][0] = "Scire";
            myLatin[13][1] = "Scio";
            myLatin[13][2] = "Scivi";
            myLatin[13][3] = "Scitum";
            myLatin[13][4] = "Знать, уметь";

            myLatin[14][0] = "Expedire";
            myLatin[14][1] = "Expedio";
            myLatin[14][2] = "Expedivi";
            myLatin[14][3] = "Expeditum";
            myLatin[14][4] = "Устраивать";

            myLatin[15][0] = "Docere";
            myLatin[15][1] = "Doceo";
            myLatin[15][2] = "Docui";
            myLatin[15][3] = "Doctum";
            myLatin[15][4] = "Учить";

            myLatin[16][0] = "Dolere";
            myLatin[16][1] = "Doleo";
            myLatin[16][2] = "Dolui";
            myLatin[16][3] = "N/A";
            myLatin[16][4] = "Болеть";

            myLatin[17][0] = "Laborare";
            myLatin[17][1] = "Laboro";
            myLatin[17][2] = "Laboravi";
            myLatin[17][3] = "Laboratum";
            myLatin[17][4] = "Работать";

            myLatin[18][0] = "Salvere";
            myLatin[18][1] = "Salve";
            myLatin[18][2] = "N/A";
            myLatin[18][3] = "N/A";
            myLatin[18][4] = "Быть здоровым, приветствие";

            myLatin[19][0] = "Valere";
            myLatin[19][1] = "Valeo";
            myLatin[19][2] = "Valui";
            myLatin[19][3] = "N/A";
            myLatin[19][4] = "Быть сильным, прощание";

            myLatin[20][0] = "Salve";
            myLatin[20][1] = "Salvete";
            myLatin[20][2] = "Здравствуй, здравствуйте";

            myLatin[21][0] = "Vivere";
            myLatin[21][1] = "Vivo";
            myLatin[21][2] = "Vixi";
            myLatin[21][3] = "Victum";
            myLatin[21][4] = "Жить";

            myLatin[22][0] = "Delere";
            myLatin[22][1] = "Deleo";
            myLatin[22][2] = "Delevi";
            myLatin[22][3] = "Deletum";
            myLatin[22][4] = "Разрушать";

            myLatin[23][0] = "Vincere";
            myLatin[23][1] = "Vinco";
            myLatin[23][2] = "Vici";
            myLatin[23][3] = "Victum";
            myLatin[23][4] = "Побеждать";

            myLatin[24][0] = "Statuere";
            myLatin[24][1] = "Statuo";
            myLatin[24][2] = "Statui";
            myLatin[24][3] = "Statutum";
            myLatin[24][4] = "Устанавливать";

            myLatin[25][0] = "Capere";
            myLatin[25][1] = "Capio";
            myLatin[25][2] = "Cepi";
            myLatin[25][3] = "Captum";
            myLatin[25][4] = "Брать, хватать";

            myLatin[26][0] = "Audire";
            myLatin[26][1] = "Audio";
            myLatin[26][2] = "Audivi";
            myLatin[26][3] = "Auditum";
            myLatin[26][4] = "Слышать, слушать";

            myLatin[27][0] = "Agere";
            myLatin[27][1] = "Ago";
            myLatin[27][2] = "Egi";
            myLatin[27][3] = "Actum";
            myLatin[27][4] = "Делать, действовать, вести";

            myLatin[28][0] = "Cogitare";
            myLatin[28][1] = "Cogito";
            myLatin[28][2] = "Cogitavi";
            myLatin[28][3] = "Cogitatum";
            myLatin[28][4] = "Мыслить";

            myLatin[29][0] = "Crescere";
            myLatin[29][1] = "Cresco";
            myLatin[29][2] = "Crevi";
            myLatin[29][3] = "Cretum";
            myLatin[29][4] = "Расти";

            myLatin[30][0] = "Decare";
            myLatin[30][1] = "Decet";
            myLatin[30][2] = "Cuit";
            myLatin[30][3] = "N/A";
            myLatin[30][4] = "Подобать";

            myLatin[31][0] = "Dedicare";
            myLatin[31][1] = "Dedico";
            myLatin[31][2] = "Dedicavi";
            myLatin[31][3] = "Dedicatum";
            myLatin[31][4] = "Посвящать";

            myLatin[32][0] = "Dicere";
            myLatin[32][1] = "Dico";
            myLatin[32][2] = "Dixi";
            myLatin[32][3] = "Dictum";
            myLatin[32][4] = "Говорить";

            myLatin[33][0] = "Discere";
            myLatin[33][1] = "Disco";
            myLatin[33][2] = "Didici";
            myLatin[33][3] = "N/A";
            myLatin[33][4] = "Учиться";

            myLatin[34][0] = "Discendere";
            myLatin[34][1] = "Discedo";
            myLatin[34][2] = "Discessi";
            myLatin[34][3] = "Discessum";
            myLatin[34][4] = "Уходить";

            myLatin[35][0] = "Dare";
            myLatin[35][1] = "Do";
            myLatin[35][2] = "Dedi";
            myLatin[35][3] = "Datum";
            myLatin[35][4] = "Давать";

            myLatin[36][0] = "Donare";
            myLatin[36][1] = "Dono";
            myLatin[36][2] = "Donavi";
            myLatin[36][3] = "Donatum";
            myLatin[36][4] = "Дарить";

            myLatin[37][0] = "Dormire";
            myLatin[37][1] = "Dormio";
            myLatin[37][2] = "Dormivi";
            myLatin[37][3] = "Dormitum";
            myLatin[37][4] = "Спать";

            myLatin[38][0] = "Dubitare";
            myLatin[38][1] = "Dubito";
            myLatin[38][2] = "Dubitavi";
            myLatin[38][3] = "Dubitatum";
            myLatin[38][4] = "Сомневаться";

            myLatin[39][0] = "Festinare";
            myLatin[39][1] = "Festino";
            myLatin[39][2] = "Festinavi";
            myLatin[39][3] = "Festinatum";
            myLatin[39][4] = "Спешить, торопиться";

            myLatin[40][0] = "Ignorare";
            myLatin[40][1] = "Ignoro";
            myLatin[40][2] = "Ignoravi";
            myLatin[40][3] = "Ignoratum";
            myLatin[40][4] = "Игнорировать";

            myLatin[41][0] = "Liquere";
            myLatin[41][1] = "Liqueo";
            myLatin[41][2] = "Liqui";
            myLatin[41][3] = "N/A";
            myLatin[41][4] = "Быть ясным, очевидным";

            myLatin[42][0] = "Militare";
            myLatin[42][1] = "Milito";
            myLatin[42][2] = "Militavi";
            myLatin[42][3] = "Militatum";
            myLatin[42][4] = "Воевать";

            myLatin[43][0] = "Narrare";
            myLatin[43][1] = "Narro";
            myLatin[43][2] = "Narravi";
            myLatin[43][3] = "Narratum";
            myLatin[43][4] = "Рассказывать";

            myLatin[44][0] = "Peccare";
            myLatin[44][1] = "Pecco";
            myLatin[44][2] = "Peccavi";
            myLatin[44][3] = "Peccatum";
            myLatin[44][4] = "Грешить";

            myLatin[45][0] = "Punire";
            myLatin[45][1] = "Punio";
            myLatin[45][2] = "Punivi";
            myLatin[45][3] = "Punitum";
            myLatin[45][4] = "Наказывать";

            myLatin[46][0] = "Sedere";
            myLatin[46][1] = "Sedeo";
            myLatin[46][2] = "Sedi";
            myLatin[46][3] = "Sessum";
            myLatin[46][4] = "Сидеть";

            myLatin[47][0] = "Sentire";
            myLatin[47][1] = "Sentio";
            myLatin[47][2] = "Sensi";
            myLatin[47][3] = "Sensum";
            myLatin[47][4] = "Чувствовать";

            myLatin[48][0] = "Sperare";
            myLatin[48][1] = "Spero";
            myLatin[48][2] = "Speravi";
            myLatin[48][3] = "Speratum";
            myLatin[48][4] = "Надеяться";

            myLatin[49][0] = "Spirare";
            myLatin[49][1] = "Spiro";
            myLatin[49][2] = "Spiravi";
            myLatin[49][3] = "Spiratum";
            myLatin[49][4] = "Дышать";

            myLatin[50][0] = "Esse";
            myLatin[50][1] = "Sum";
            myLatin[50][2] = "Fui";
            myLatin[50][3] = "N/A";
            myLatin[50][4] = "Быть";

            myLatin[51][0] = "Vadere";
            myLatin[51][1] = "Vado";
            myLatin[51][2] = "N/A";
            myLatin[51][3] = "N/A";
            myLatin[51][4] = "Идти, уходить";

            myLatin[52][0] = "Vetare";
            myLatin[52][1] = "Veto";
            myLatin[52][2] = "Vetui";
            myLatin[52][3] = "Vetitum";
            myLatin[52][4] = "Запрещать";

            myLatin[53][0] = "Alere";
            myLatin[53][1] = "Alo";
            myLatin[53][2] = "Alui";
            myLatin[53][3] = "Alitum";
            myLatin[53][4] = "Питать";

            myLatin[54][0] = "Amare";
            myLatin[54][1] = "Amo";
            myLatin[54][2] = "Amavi";
            myLatin[54][3] = "Amatus";
            myLatin[54][4] = "Любить";

            myLatin[55][0] = "Carere";
            myLatin[55][1] = "Careo";
            myLatin[55][2] = "Carui";
            myLatin[55][3] = "N/A";
            myLatin[55][4] = "Не иметь, быть лишенным чего-либо";

            myLatin[56][0] = "Colere";
            myLatin[56][1] = "Colo";
            myLatin[56][2] = "Colui";
            myLatin[56][3] = "Cultum";
            myLatin[56][4] = "Обрабатывать, почитать";

            myLatin[57][0] = "Habere";
            myLatin[57][1] = "Habeo";
            myLatin[57][2] = "Habui";
            myLatin[57][3] = "Habitum";
            myLatin[57][4] = "Иметь";

            myLatin[58][0] = "Errare";
            myLatin[58][1] = "Erro";
            myLatin[58][2] = "Erravi";
            myLatin[58][3] = "Erratum";
            myLatin[58][4] = "Ошибаться";

            myLatin[59][0] = "Erre";
            myLatin[59][1] = "Erubesco";
            myLatin[59][2] = "Rubui";
            myLatin[59][3] = "N/A";
            myLatin[59][4] = "Краснеть";

            myLatin[60][0] = "Execitare";
            myLatin[60][1] = "Exercio";
            myLatin[60][2] = "Exercui";
            myLatin[60][3] = "Exercitum";
            myLatin[60][4] = "Упражнять";

            myLatin[61][0] = "Fodere";
            myLatin[61][1] = "Fodio";
            myLatin[61][2] = "Fodi";
            myLatin[61][3] = "Fossum";
            myLatin[61][4] = "Рыть";

            myLatin[62][0] = "Fundere";
            myLatin[62][1] = "Fundo";
            myLatin[62][2] = "Fudi";
            myLatin[62][3] = "Fusum";
            myLatin[62][4] = "Лить";

            myLatin[63][0] = "Ornare";
            myLatin[63][1] = "Orno";
            myLatin[63][2] = "Ornavi";
            myLatin[63][3] = "Ornatum";
            myLatin[63][4] = "Украшать";

            myLatin[64][0] = "Praebere";
            myLatin[64][1] = "Praebeo";
            myLatin[64][2] = "Praebui";
            myLatin[64][3] = "Praebitum";
            myLatin[64][4] = "Предоставлять";

            myLatin[65][0] = "Sternere";
            myLatin[65][1] = "Sterno";
            myLatin[65][2] = "Stravi";
            myLatin[65][3] = "Stratum";
            myLatin[65][4] = "Стлать, мостить";

            myLatin[66][0] = "Studere";
            myLatin[66][1] = "Studeo";
            myLatin[66][2] = "Studui";
            myLatin[66][3] = "N/A";
            myLatin[66][4] = "Ревностно стараться, усердно заниматься, учиться";

            myLatin[67][0] = "Monstrare";
            myLatin[67][1] = "Monstro";
            myLatin[67][2] = "Monstravi";
            myLatin[67][3] = "Monstratum";
            myLatin[67][4] = "Показывать";

            myLatin[68][0] = "Abscondere";
            myLatin[68][1] = "Abscondo";
            myLatin[68][2] = "Abscondi";
            myLatin[68][3] = "Absconditum";
            myLatin[68][4] = "Прятать, скрывать";

            myLatin[69][0] = "Accedere";
            myLatin[69][1] = "Accedo";
            myLatin[69][2] = "Accessi";
            myLatin[69][3] = "Accessum";
            myLatin[69][4] = "Подходить, обращаться, появляться";

            myLatin[70][0] = "Accendere";
            myLatin[70][1] = "Accendo";
            myLatin[70][2] = "Accendi";
            myLatin[70][3] = "Accensum";
            myLatin[70][4] = "Зажигать";

            myLatin[71][0] = "Accidere";
            myLatin[71][1] = "Accido";
            myLatin[71][2] = "Accidi";
            myLatin[71][3] = "N/A";
            myLatin[71][4] = "Случаться";

            myLatin[72][0] = "Accipere";
            myLatin[72][1] = "Accipio";
            myLatin[72][2] = "Accepi";
            myLatin[72][3] = "Acceptum";
            myLatin[72][4] = "Получать, принимать";

            myLatin[73][0] = "Acquirere";
            myLatin[73][1] = "Acquiro";
            myLatin[73][2] = "Acquisivi (Acquisii)";
            myLatin[73][3] = "Acquisitum";
            myLatin[73][4] = "Приобретать, зарабатывать";

            myLatin[74][0] = "Acuere";
            myLatin[74][1] = "Acuo";
            myLatin[74][2] = "Acui";
            myLatin[74][3] = "Acutum";
            myLatin[74][4] = "Заострять";

            myLatin[75][0] = "Adhibere";
            myLatin[75][1] = "Adhibeo";
            myLatin[75][2] = "Adhibui";
            myLatin[75][3] = "Adhibitum";
            myLatin[75][4] = "Применять";

            myLatin[76][0] = "Adimplere";
            myLatin[76][1] = "Adimpleo";
            myLatin[76][2] = "Adimplevi";
            myLatin[76][3] = "Adimpletum";
            myLatin[76][4] = "Наполнять, переполнять";

            myLatin[77][0] = "Senescere";
            myLatin[77][1] = "Senesco";
            myLatin[77][2] = "Senui";
            myLatin[77][3] = "N/A";
            myLatin[77][4] = "Стареть";

            myLatin[78][0] = "Abundare";
            myLatin[78][1] = "Abundo";
            myLatin[78][2] = "Abundavi";
            myLatin[78][3] = "Abundatum";
            myLatin[78][4] = "Изобиловать";

            myLatin[79][0] = "Abire";
            myLatin[79][1] = "Abeo";
            myLatin[79][2] = "Abii (Abivi)";
            myLatin[79][3] = "Abitum";
            myLatin[79][4] = "Уходить, удаляться";

            myLatin[80][0] = "Adipisci";
            myLatin[80][1] = "Adipiscor";
            myLatin[80][2] = "Adeptus sum";
            myLatin[80][3] = "N/A";
            myLatin[80][4] = "Достигать, обретать, получать";

            myLatin[81][0] = "Adiuvare";
            myLatin[81][1] = "Adiutum";
            myLatin[81][2] = "Adiuvi";
            myLatin[81][3] = "Adiuvo";
            myLatin[81][4] = "Помогать";

            myLatin[82][0] = "Admirari";
            myLatin[82][1] = "Admiror";
            myLatin[82][2] = "Admiravi";
            myLatin[82][3] = "Admiratum";
            myLatin[82][4] = "Удивляться, восхищаться";

            myLatin[83][0] = "Adnuntiare";
            myLatin[83][1] = "Adnuntio";
            myLatin[83][2] = "Adnuntiavi";
            myLatin[83][3] = "Adnuntiatum";
            myLatin[83][4] = "Возвещать";

            myLatin[84][0] = "Adorare";
            myLatin[84][1] = "Adoro";
            myLatin[84][2] = "Adoravi";
            myLatin[84][3] = "Adoratum";
            myLatin[84][4] = "Поклоняться";

            myLatin[85][0] = "Adpropinquare";
            myLatin[85][1] = "Adpropinquo";
            myLatin[85][2] = "Adpropinquavi";
            myLatin[85][3] = "Adpropinquatum";
            myLatin[85][4] = "Приближаться";

            myLatin[86][0] = "Adscribere";
            myLatin[86][1] = "Adscribo";
            myLatin[86][2] = "Adscripsi";
            myLatin[86][3] = "Adscriptum";
            myLatin[86][4] = "Причислять";

            myLatin[87][0] = "Adesse";
            myLatin[87][1] = "Adsum";
            myLatin[87][2] = "Affui";
            myLatin[87][3] = "N/A";
            myLatin[87][4] = "Наступать о времени, присутствовать, приходить";

            myLatin[88][0] = "Advenire";
            myLatin[88][1] = "Advenio";
            myLatin[88][2] = "Adveni";
            myLatin[88][3] = "Adventum";
            myLatin[88][4] = "Приходить";

            myLatin[89][0] = "Advolare";
            myLatin[89][1] = "Advolo";
            myLatin[89][2] = "Advolavi";
            myLatin[89][3] = "Advolatum";
            myLatin[89][4] = "Подлетать";

            myLatin[90][0] = "Aedificare";
            myLatin[90][1] = "Aedifico";
            myLatin[90][2] = "Aedificavi";
            myLatin[90][3] = "Aedificatum";
            myLatin[90][4] = "Строить";

            myLatin[91][0] = "Afferre";
            myLatin[91][1] = "Affero";
            myLatin[91][2] = "Attuli";
            myLatin[91][3] = "Allatum";
            myLatin[91][4] = "Приносить";

            myLatin[92][0] = "Agnoscere";
            myLatin[92][1] = "Agnosco";
            myLatin[92][2] = "Agnovi";
            myLatin[92][3] = "Agnitum";
            myLatin[92][4] = "Узнавать, познавать";

            myLatin[93][0] = "Aiere";
            myLatin[93][1] = "Aio";
            myLatin[93][2] = "N/A";
            myLatin[93][3] = "N/A";
            myLatin[93][4] = "Говорить";

            myLatin[94][0] = "Allevare";
            myLatin[94][1] = "Allevo";
            myLatin[94][2] = "Allevavi";
            myLatin[94][3] = "Allevatum";
            myLatin[94][4] = "Облегчать";

            myLatin[95][0] = "Alligare";
            myLatin[95][1] = "Alligo";
            myLatin[95][2] = "Alligavi";
            myLatin[95][3] = "Alligatum";
            myLatin[95][4] = "Привязывать";

            myLatin[96][0] = "Alloqui";
            myLatin[96][1] = "Alloquor";
            myLatin[96][2] = "Allocutus sum";
            myLatin[96][3] = "N/A";
            myLatin[96][4] = "Обращаться с речью";

            myLatin[97][0] = "Ambire";
            myLatin[97][1] = "Ambio";
            myLatin[97][2] = "Ambivi";
            myLatin[97][3] = "Ambitum";
            myLatin[97][4] = "Обходить с просьбами, хлопотать";

            myLatin[98][0] = "Ambulare";
            myLatin[98][1] = "Ambulo";
            myLatin[98][2] = "Ambulavi";
            myLatin[98][3] = "Ambulatum";
            myLatin[98][4] = "Ходить, гулять";

            myLatin[99][0] = "Mirare";
            myLatin[99][1] = "Miro";
            myLatin[99][2] = "Miravi";
            myLatin[99][3] = "N/A";
            myLatin[99][4] = "Дивиться, удивляться";

            myLatin[100][0] = "Amiterre";
            myLatin[100][1] = "Ammito";
            myLatin[100][2] = "Amisi";
            myLatin[100][3] = "Amissum";
            myLatin[100][4] = "Оставлять, бросать";

            myLatin[101][0] = "Flere";
            myLatin[101][1] = "Fleo";
            myLatin[101][2] = "Flevi";
            myLatin[101][3] = "Fletum";
            myLatin[101][4] = "Плакать";

            myLatin[102][0] = "Venire";
            myLatin[102][1] = "Venio";
            myLatin[102][2] = "Veni";
            myLatin[102][3] = "Ventum";
            myLatin[102][4] = "Приходить";

            myLatin[103][0] = "Tegere";
            myLatin[103][1] = "Tego";
            myLatin[103][2] = "Texi";
            myLatin[103][3] = "Tectum";
            myLatin[103][4] = "Скрывать, укрывать";

            myLatin[104][0] = "Minuere";
            myLatin[104][1] = "Minuo";
            myLatin[104][2] = "Minui";
            myLatin[104][3] = "Minutum";
            myLatin[104][4] = "Уменьшать";

            myLatin[105][0] = "Insula";
            myLatin[105][1] = "Island";

            myLatin[106][0] = "Pars (Partis)";
            myLatin[106][1] = "Часть";

            myLatin[107][0] = "Heres (Heredis)";
            myLatin[107][1] = "Наследник";

            myLatin[108][0] = "Filius";
            myLatin[108][1] = "Сын";

            myLatin[109][0] = "Exheredatus";
            myLatin[109][1] = "Лишенный наследства";

            myLatin[110][0] = "Advena";
            myLatin[110][1] = "Пришелец";

            myLatin[111][0] = "Et";
            myLatin[111][1] = "И";

            myLatin[112][0] = "Peregrinus";
            myLatin[112][1] = "Чужестранец, иностранец";

            myLatin[113][0] = "Iusus";
            myLatin[113][1] = "Игра";

            myLatin[114][0] = "Noxius";
            myLatin[114][1] = "Наносящий вред";

            myLatin[115][0] = "Iniuria";
            myLatin[115][1] = "Обида, оскорбление, несправедливость";

            myLatin[116][0] = "Remedium";
            myLatin[116][1] = "Средство, лекарство";

            myLatin[117][0] = "Oblivio (Oblivionis)";
            myLatin[117][1] = "Забвение";

            myLatin[118][0] = "Incertus (a, um)";
            myLatin[118][1] = "Неопределенный";

            myLatin[119][0] = "Animus";
            myLatin[119][1] = "Дух, душа, ум";

            myLatin[120][0] = "Dimidium";
            myLatin[120][1] = "Половина, середина";

            myLatin[121][0] = "Sapientia";
            myLatin[121][1] = "Разумность, мудрость";

            myLatin[122][0] = "Quare";
            myLatin[122][1] = "Почему";

            myLatin[123][0] = "Maestus";
            myLatin[123][1] = "Грустный, печальный";

            myLatin[124][0] = "Ibi";
            myLatin[124][1] = "Там";

            myLatin[125][0] = "Atrium";
            myLatin[125][1] = "Зал";

            myLatin[126][0] = "Nobilitas";
            myLatin[126][1] = "Дворянство";

            myLatin[127][0] = "Armarium";
            myLatin[127][1] = "Шкаф";

            myLatin[128][0] = "Tributum";
            myLatin[128][1] = "Налог, подать, добровольный взнос";

            myLatin[129][0] = "Dum";
            myLatin[129][1] = "Пока";

            myLatin[130][0] = "Affligere";
            myLatin[130][1] = "Affligo";
            myLatin[130][2] = "Afflixi";
            myLatin[130][3] = "Afflictum";
            myLatin[130][4] = "Поражать, огорчать";

            myLatin[131][0] = "Hospes";
            myLatin[131][1] = "Гость";

            myLatin[132][0] = "Semper";
            myLatin[132][1] = "Всегда";
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeMyArray();
    }
}