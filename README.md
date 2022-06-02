# Втора лабораториска вежба по Софтверско инженерство
# Бојан Димитровски, бр. на индекс 203213
# Control Flow Graph
<br /> ![CFGbaranje2](https://user-images.githubusercontent.com/101260180/171622319-381672e5-a2eb-40a0-a177-42b69ff88124.png) <br />
<br />Цикломатска комплексност<br />
<br />Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=8, па цикломатската комплексност изнесува 9.<br />
<br />Тест случаи според критериумот Every statement<br />
<br />![image](https://user-images.githubusercontent.com/101260180/171623047-e735c71d-e7eb-42b1-8235-9726cd6317c1.png)<br />
<br />Тест случаи според критериумот Every branch<br />
<br />![image](https://user-images.githubusercontent.com/101260180/171623254-44c9f8a6-c2e5-490f-bd3b-96f97f868fc9.png)<br />
<br />Објаснување на напишаните unit tests<br />
<br />Првиот тест се спроведува со помош на assertEquals(result1, SILab2.function(list1)) каде што result1 ни е листата што очекуваме да ни ја врати програмот.<br />
<br />Во вториот тест се користи ilex=assertThrows(IllegalArgumentException.class,()->SILab2.function(list2)) каде што очекуваме да биде фрлен исклучок бидејќи немаме елементи во листата, исклучокот треба да гласи : "List length should be greater than 0"<br />
<br />Во третиот тест се користи ilex=assertThrows(IllegalArgumentException.class,()->SILab2.function(list3)) каде што повторно очекуваме исклучок но овој пат исклучокот треба да гласи : "List length should be a perfect square"<br />
