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
<br>
**Втор тест случај**: Username=null; Email: содржи **@** и **.** ; Листата содржи два корисници: во првиот for loop корисничкото име и email-от на корисникот се еднакви со веќе постоечкото, додека во вториот for loop не се. Pasw: должина<8; - ги задоволува гранките: 1-3, 3-4, 4-5, 5-6, 6-7, 7-8, 8-9.1, 9.1-9.2, 9.2-10, 9.2-17, 9.3-9.2, 10-11, 11-12, 11-13, 12-13, 13-14, 13-15, 14-15, 14-16, 15-16, 16-9.3, 17-18, 18-19, 19-20, 20-21, 21-22, 22-23, 23-33, 33-34.<br>
<br>
**Трет тест случај**: Username=username; Email: не содржи **@** и **.** ;  Pasw: должина>8, не го содржи корисничкото име, не содржи празни места, (доколку врти низ пасвордите на сите корисници во листата) во првиот for loop корисничкото пасвордот содржи специјални карактери, додека во вториот for loop не содржи. - ги задоволува гранките: 3-5, 7-18, 11-13, 14-16, 22-24, 24-25, 25-26.1, 26.1-26.2, 26.2-27, 26.2-30, 26.3-26.2, 27-28, 27-29, 28-29, 29-26.3, 30-31, 31-32, 32-33.<br>
<br>
**Четврт тест случај**: Username=username; Email: X; Pasw: содржи празни места. - ги задоволува гранките 25-31.<br> [lab2.xlsx](https://github.com/JovanoskaJovana/SI_2023_lab2_213046/files/11585134/lab2.xlsx)
###ест случаи според Multiple Condition критериумот за условот: if (user==null || user.getPassword()==null || user.getEmail()==null)

