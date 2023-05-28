# Втора лабораториска вежба по Софтверско инженерство
## Јована Јованоска, бр. на индекс 213046
### Control Flow Graph
![SILAB](https://github.com/JovanoskaJovana/SI_2023_lab2_213046/assets/126422782/7997776a-380f-4a03-8327-108aad09f44c)
### Цикломатска комплексност
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата Р+1, каде бројот Р е бројот на предикатни јазли. Во случајов, Р=10, па цикломатската комплексност изнесува 11.
### Тест случаи според критериумот Every branch
Потребни беа 4 тест случаи за да се исполни критериумот Every branch. Барањето го решив и претставив во excel табела.<br>
<br>
**Прв тест случај**: User=null; Email:X; Pasw:X; - ги задоволува гранките: 1-2, 2-34. <br>
**Втор тест случај**: Username=null; Email: содржи **@** и **.** ; Листата содржи два корисници: во првиот for loop корисничкото име и email-от на корисникот се еднакви со веќе постоечкото, додека во вториот for loop не се. Pasw: должина<8.<br>
**Трет тест случај**: Username=username; Email: не содржи **@** и **.** ;  Pasw: должина>8, не го содржи корисничкото име, не содржи празни места, пасвордот содржи специјални карактери.<br>
**Четврт тест случај**: Username=username; Email: X;  Pasw: должина>8, не го содржи корисничкото име, не содржи празни места, пасвордот не содржи специјални карактери.<br> 
**Петти тест случај**: Username=username; Email: X; Pasw: содржи празни места.<br> 
[lab2.xlsx](https://github.com/JovanoskaJovana/SI_2023_lab2_213046/files/11585397/lab2.xlsx)
### Tест случаи според Multiple Condition критериумот за условот: if (user==null || user.getPassword()==null || user.getEmail()==null)
![image](https://github.com/JovanoskaJovana/SI_2023_lab2_213046/assets/126422782/2c719fd8-1a58-45b2-b267-9028a0f1cafa)
<br> Вкупно потребни ќе бидат 4 тест случаи според Multiple Condition критериумот.<br>
**Прв тест случај**: Т X X - доколку првиот исказ е исполнет, не е важно дали останатите искази се исполнети, бидејќи условот ќе биде точен во секој случај - Т.
<br>
**Втор тест случај**: F T X - доколку првиот исказ не е исполнет, а вториот е, не е важна точноста на третиот исказ, бидејќи условот е исполнет - Т.
<br>
**Трет тест случај**: F F T - доколку првите два искази не се исполнети, но ако е исполнет третиот исказ, условот е точен - Т.
<br>
**Четврт тест случај**: F F F - доколку ниту еден од исказите не е исполнет, условот ќе биде неточен - F.


