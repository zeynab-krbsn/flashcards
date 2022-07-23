package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;

//    Integer[] icon = {R.drawable.filed0, R.drawable.filed1, R.drawable.filed2, R.drawable.filed3, R.drawable.filed4, R.drawable.filed5};
    String[] filed = {"شبکه و نرم افزار رایانه","حسابداری","پویانمایی","فوتوگرافیک","گرافیک","نقاشی"};
    String[] level = {"دهم","یازدهم","دوازدهم"};
    String[] level2 = {"دهم"};

    //کامپیوتر
    String[] filed0level0 = {"دانش فنی پایه ", "نصب و راه اندازی سیستم های رایانه ای", "تولید محتوای الکترونیک و برنامه سازی", "نقشه کشی فنی رایانه ای"};
    String[] filed0level1 = {"توسعه برنامه سازی و پایگاه داده", "پیاده سازی سیستم های اطلاعاتی و طراحی وب"};
    String[] filed0level2 = {"دانش فنی تخصصی", "نصب و نگهداری تجهیزات شبکه و سخت افزار", "تجارت الکترونیک و امنیت شبکه"};
    //حسابداری
    String[] filed1level0 = {"ارتباط موثر", "دانش فنی پایه", "حسابداری وجوه نقد و تحریر دفاتر قانونی", "حسابداری خرید و فروش"};
    String[] filed1level1 = {"حسابداری حقوق و دستمزد", "حسابداری اموال و انبار"};
    String[] filed1level2 = {"دانش فنی تخصصی", "حسابداری بهای تمام شده و مالیاتی", "حسابداری تهیه و تنظیم صورت های مالی"};
    //پویانمایی
    String[] filed2level0 = {"دانش فنی پایه", "طراحی و زبان بصری", "متحرک سازی دوبعدی", "طراحی شخصیت در پویانمایی"};
    String[] filed2level1 = {"طراحی فضا و صحنه در پویانمایی", "تولید پویانمایی سه بعدی صحنه ای"};
    String[] filed2level2 = {"دانش فنی تخصصی", "متحرک سازی رایانه ای", "ارزیابی تولید در پویا نمایی"};
    //فتو گرافیک
    String[] filed3level0 = {"دانش فنی پایه", "طراحی و زبان بصری", "عکاسی پرسنلی و ویرایش حروف و تصویر", "تصویرسازی آموزشی و تایپوگرافی"};
    String[] filed3level1 = {"عکاسی آتلیه و مراسم", "طراحی نشانه، تصویرگری کتاب کودک و نظارت چاپ"};
    String[] filed3level2 = {"دانش فنی تخصصی", "عکاسی طبیعت، مستند و گزارشی", "گرافیک نشر و مطبوعات"};
    //گرافیک
    String[] filed4level0 = {"طراحی (1)", "خوشنویسی", "مبانی هنرهای تجسمی", "علم مناظر و مرایا", "عکاسی (1)", "تاریخ هنر ایران"};
    String[] filed4level1 = {"عکاسی (2)", "کارگاه چاپ دستی (1)", "تاریخ هنر جهان", "طراحی (2)"};
    String[] filed4level2 = {"مبانی تصویرسازی", "پایه و اصول صفحه آرایی", "خط در گرافیک"};
    //نقاشی
    String[] filed5level0 = {"طراحی (1)", "مبانی هنرهای تجسمی", "علم مناظر و مرایا", "عکاسی (1)", "تاریخ هنر ایران"};
//    String[] filed5level1 = {"به زودی..."};
//    String[] filed5level2 = {"به زودی..."};

    LinkedHashMap<String, String[]> thirdLevel0 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevel1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevel2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevel3 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevel4 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevel5 = new LinkedHashMap<>();
    /**
     * Second level array list
     */
    List<String[]> secondLevel = new ArrayList<>();
    /**
     * Inner level data
     */
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpAdapter();
    }

    private void setUpAdapter() {
        secondLevel.add(level);
        secondLevel.add(level);
        secondLevel.add(level);
        secondLevel.add(level);
        secondLevel.add(level);
        secondLevel.add(level2);

        thirdLevel0.put(level[0], filed0level0);
        thirdLevel0.put(level[1], filed0level1);
        thirdLevel0.put(level[2], filed0level2);

        thirdLevel1.put(level[0], filed1level0);
        thirdLevel1.put(level[1], filed1level1);
        thirdLevel1.put(level[2], filed1level2);

        thirdLevel2.put(level[0], filed2level0);
        thirdLevel2.put(level[1], filed2level1);
        thirdLevel2.put(level[2], filed2level2);

        thirdLevel3.put(level[0], filed3level0);
        thirdLevel3.put(level[1], filed3level1);
        thirdLevel3.put(level[2], filed3level2);

        thirdLevel4.put(level[0], filed4level0);
        thirdLevel4.put(level[1], filed4level1);
        thirdLevel4.put(level[2], filed4level2);

        thirdLevel5.put(level2[0], filed5level0);
//        thirdLevel5.put(level[1], filed5level1);
//        thirdLevel5.put(level[2], filed5level2);


        data.add(thirdLevel0);
        data.add(thirdLevel1);
        data.add(thirdLevel2);
        data.add(thirdLevel3);
        data.add(thirdLevel4);
        data.add(thirdLevel5);

        expandableListView = (ExpandableListView) findViewById(R.id.expandable_listview);
        //passing three level of information to constructor
        ThreeLevelListAdapter threeLevelListAdapterAdapter = new ThreeLevelListAdapter(this, filed, secondLevel, data);
        expandableListView.setAdapter(threeLevelListAdapterAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition != previousGroup)
                    expandableListView.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });
    }
}
