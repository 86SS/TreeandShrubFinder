package com.example.lucas.treeandshrubfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.*;
import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    CheckBox cb_xs, cb_s, cb_m, cb_l, cb_xl, cb_xxl, cb_deciduous, cb_evergreen, cb_y1, cb_y2, cb_y3, cb_y4, cb_slow, cb_mod, cb_fast, cb_none1, cb_red, cb_white, cb_pink, cb_yellow, cb_orange, cb_none2, cb_apple, cb_pear, cb_peach, cb_almond, cb_lemon, cb_lime, cb_kiwi, cb_fig, cb_persimmon, cb_grape, cb_blueberry, cb_blackberry, cb_raspberry, cb_pomegranate, cb_plum, cb_gooseberry, cb_elderberry, cb_pecan, cb_walnut;
    ArrayList<String> selection = new ArrayList<String>();
    ArrayList<Plant> test = new ArrayList<Plant>();
    ArrayList<Plant> test2 = new ArrayList<Plant>(test.size());
    Plant Brown_Turkey_Fig = new Plant("Brown Turkey Fig");
    Plant Emerald_Green_Arborvitae = new Plant("Emerald Green Arborvitae");
    Plant Delaware_Valley_White_Azalea = new Plant("Delaware Valley White Azalea");
    Plant Lemon_Pfizz_Juniper = new Plant("Lemon Pfizz Juniper");
    Plant Kwanzan_Cherry = new Plant("Kwanzan Cherry");
    Plant Ebony_Flame_Crape_Myrtle = new Plant("Ebony Flame Crape Myrtle");
    Plant Dragon_Lady_Holly = new Plant("Dragon Lady Holly");
    Plant Autumn_Blaze_Maple = new Plant("Autumn Blaze Maple");
    Plant Leyland_Cypress = new Plant("Leyland Cypress");
    Plant Manhattan_Euonymus = new Plant("Manhattan Euonymus");
    Plant Inkberry_Holly = new Plant("Inkberry Holly");
    Plant Cherokee_Holly = new Plant("Cherokee Holly");
    Plant Green_Luster_Holly = new Plant("Green Luster Holly");
    Plant Compacta_Holly = new Plant("Compacta Holly");
    Plant Sky_Pencil_Holly = new Plant("Sky Pencil Holly");
    Plant Helleri_Holly = new Plant("Helleri Holly");
    Plant Red_Beauty_Holly = new Plant("Red Beauty Holly");
    Plant Soft_Touch_Holly = new Plant("Soft Touch Holly");
    Plant Nellie_Stevens_Holly = new Plant("Nellie Stevens Holly");
    Plant China_Twins_Holly = new Plant("China Twins Holly");
    Plant Hoogendoorn_Holly = new Plant("Hoogendoorn Holly");
    Plant Dynamite_Crape_Myrtle = new Plant("Dynamite Crape Myrtle");
    Plant Nantucket_Privet = new Plant("Nantucket Privet");
    Plant Acer_Palmatum_Japanese_Maple = new Plant("Acer Palmatum Japanese Maple");
    Plant Weeping_Giant_Sequoia = new Plant("Weeping Giant Sequoia");
    Plant Aurea_Atlas_Cedar = new Plant("Aurea Atlas Cedar");
    Plant Columnar_Norway_Spruce = new Plant("Columnar Norway Spruce");
    Plant Paperbark_Maple = new Plant("Paperbark Maple");
    Plant Manchurian_Maple = new Plant("Manchurian Maple");
    Plant Little_Gem_Spruce = new Plant("Little Gem Spruce");
    Plant Bloodgood_Japanese_Maple = new Plant("Bloodgood Japanese Maple");
    Plant Silver_King_Euonymus = new Plant("Silver King Euonymus");
    Plant Moonshadow_Euonymus = new Plant("Moonshadow Euonymus");
    Plant Golden_Euonymus = new Plant("Golden Euonymus");
    Plant Green_Spire_Euonymus = new Plant("Green Spire Euonymus");
    Plant Blue_Point_Juniper = new Plant("Blue Point Juniper");
    Plant Australis_Magnolia = new Plant("Australis Magnolia");
    Plant Green_Giant_Arborvitae = new Plant("Green Giant Arborvitae");
    Plant Weeping_Alaskan_Cedar = new Plant("Weeping Alaskan Cedar");
    Plant Contorta_Pine = new Plant("Contorta Pine");
    Plant Little_Gem_Magnolia = new Plant("Little Gem Magnolia");
    Plant Otto_Luyken_Cherry_Laurel = new Plant("Otto Luyken Cherry Laurel");
    Plant Skip_Laurel = new Plant("Skip Laurel");
    Plant Serbian_Spruce = new Plant("Serbian Spruce");
    Plant Ann_Magnolia = new Plant("Ann Magnolia");
    Plant Forsythia = new Plant("Forsythia");
    Plant Dappled_Willow = new Plant("Dappled Willow");
    Plant Radicans_Cryptomeria = new Plant("Radicans Cryptomeria");
    Plant Prairiefire_Crabapple = new Plant("Prairiefire Crabapple");
    Plant Tulip_Poplar = new Plant("Tulip Poplar");
    Plant Sweet_Bay_Magnolia = new Plant("Sweet Bay Magnolia");
    Plant Celeste_Fig = new Plant("Celeste Fig");
    Plant Male_Kiwi = new Plant("Male Kiwi");
    Plant Wonderful_Pomegranate = new Plant("Wonderful Pomegranate");
    Plant Caroline_Raspberry = new Plant("Caroline Raspberry");
    Plant Ouachita_Blackberry = new Plant("Ouachita Blackberry");
    Plant Female_Kiwi = new Plant("Female Kiwi");
    Plant Issai_Kiwi = new Plant("Issai Kiwi");
    Plant Triple_Crown_Blackberry = new Plant("Triple Crown Blackberry");
    Plant Concord_Grape = new Plant("Concord Grape");
    Plant Neptune_Grape = new Plant("Neptune Grape");
    Plant Jewel_Raspberry = new Plant("Jewel Raspberry");
    Plant Hinnonmaki_Gooseberry = new Plant("Hinnonmaki Gooseberry");
    Plant Pixwell_Gooseberry = new Plant("Pixwell Gooseberry");
    Plant Black_Beauty_Elderberry = new Plant("Black Beauty Elderberry");
    Plant Black_Lace_Elderberry = new Plant("Black Lace Elderberry");
    Plant Raspberry_Shortcake = new Plant("Raspberry Shortcake");
    Plant Willamette_Raspberry = new Plant("Willamette Raspberry");
    Plant Pink_Icing_Blueberry = new Plant("Pink Icing Blueberry");
    Plant Peach_Sorbet_Blueberry = new Plant("Peach Sorbet Blueberry");
    Plant Blueberry_Glaze = new Plant("Blueberry Glaze");
    Plant Duke_Blueberry = new Plant("Duke Blueberry");
    Plant Chippewa_Blueberry = new Plant("Chippewa Blueberry");
    Plant Jersey_Blueberry = new Plant("Jersey Blueberry");
    Plant Prime_Ark_Blackberry = new Plant("Prime Ark Blackberry");
    Plant Chandler_Blueberry = new Plant("Chandler Blueberry");
    Plant ONeal_Blueberry = new Plant("ONeal Blueberry");
    Plant Patriot_Blueberry = new Plant("Patriot Blueberry");
    Plant Blue_Jay_Blueberry = new Plant("Blue Jay Blueberry");

    @Override
    public void onResume(){
        super.onResume();

        test.add(Brown_Turkey_Fig);
        test.add(Emerald_Green_Arborvitae);
        test.add(Delaware_Valley_White_Azalea);
        test.add(Lemon_Pfizz_Juniper);
        test.add(Kwanzan_Cherry);
        test.add(Ebony_Flame_Crape_Myrtle);
        test.add(Dragon_Lady_Holly);
        test.add(Autumn_Blaze_Maple);
        test.add(Leyland_Cypress);
        test.add(Manhattan_Euonymus);
        test.add(Inkberry_Holly);
        test.add(Cherokee_Holly);
        test.add(Green_Luster_Holly);
        test.add(Compacta_Holly);
        test.add(Sky_Pencil_Holly);
        test.add(Helleri_Holly);
        test.add(Red_Beauty_Holly);
        test.add(Soft_Touch_Holly);
        test.add(Nellie_Stevens_Holly);
        test.add(China_Twins_Holly);
        test.add(Hoogendoorn_Holly);
        test.add(Dynamite_Crape_Myrtle);
        test.add(Nantucket_Privet);
        test.add(Acer_Palmatum_Japanese_Maple);
        test.add(Weeping_Giant_Sequoia);
        test.add(Aurea_Atlas_Cedar);
        test.add(Columnar_Norway_Spruce);
        test.add(Paperbark_Maple);
        test.add(Manchurian_Maple);
        test.add(Little_Gem_Spruce);
        test.add(Bloodgood_Japanese_Maple);
        test.add(Silver_King_Euonymus);
        test.add(Moonshadow_Euonymus);
        test.add(Golden_Euonymus);
        test.add(Green_Spire_Euonymus);
        test.add(Blue_Point_Juniper);
        test.add(Australis_Magnolia);
        test.add(Green_Giant_Arborvitae);
        test.add(Weeping_Alaskan_Cedar);
        test.add(Contorta_Pine);
        test.add(Little_Gem_Magnolia);
        test.add(Otto_Luyken_Cherry_Laurel);
        test.add(Skip_Laurel);
        test.add(Serbian_Spruce);
        test.add(Ann_Magnolia);
        test.add(Forsythia);
        test.add(Dappled_Willow);
        test.add(Radicans_Cryptomeria);
        test.add(Prairiefire_Crabapple);
        test.add(Tulip_Poplar);
        test.add(Sweet_Bay_Magnolia);
        test.add(Celeste_Fig);
        test.add(Male_Kiwi);
        test.add(Wonderful_Pomegranate);
        test.add(Caroline_Raspberry);
        test.add(Ouachita_Blackberry);
        test.add(Female_Kiwi);
        test.add(Issai_Kiwi);
        test.add(Triple_Crown_Blackberry);
        test.add(Concord_Grape);
        test.add(Neptune_Grape);
        test.add(Jewel_Raspberry);
        test.add(Hinnonmaki_Gooseberry);
        test.add(Pixwell_Gooseberry);
        test.add(Black_Beauty_Elderberry);
        test.add(Black_Lace_Elderberry);
        test.add(Raspberry_Shortcake);
        test.add(Willamette_Raspberry);
        test.add(Pink_Icing_Blueberry);
        test.add(Peach_Sorbet_Blueberry);
        test.add(Blueberry_Glaze);
        test.add(Duke_Blueberry);
        test.add(Chippewa_Blueberry);
        test.add(Jersey_Blueberry);
        test.add(Prime_Ark_Blackberry);
        test.add(Chandler_Blueberry);
        test.add(ONeal_Blueberry);
        test.add(Patriot_Blueberry);
        test.add(Blue_Jay_Blueberry);

        test2.clear();
        selection.clear();
    }

    @Override
    public void onStart(){
        super.onStart();

        test.add(Brown_Turkey_Fig);
        test.add(Emerald_Green_Arborvitae);
        test.add(Delaware_Valley_White_Azalea);
        test.add(Lemon_Pfizz_Juniper);
        test.add(Kwanzan_Cherry);
        test.add(Ebony_Flame_Crape_Myrtle);
        test.add(Dragon_Lady_Holly);
        test.add(Autumn_Blaze_Maple);
        test.add(Leyland_Cypress);
        test.add(Manhattan_Euonymus);
        test.add(Inkberry_Holly);
        test.add(Cherokee_Holly);
        test.add(Green_Luster_Holly);
        test.add(Compacta_Holly);
        test.add(Sky_Pencil_Holly);
        test.add(Helleri_Holly);
        test.add(Red_Beauty_Holly);
        test.add(Soft_Touch_Holly);
        test.add(Nellie_Stevens_Holly);
        test.add(China_Twins_Holly);
        test.add(Hoogendoorn_Holly);
        test.add(Dynamite_Crape_Myrtle);
        test.add(Nantucket_Privet);
        test.add(Acer_Palmatum_Japanese_Maple);
        test.add(Weeping_Giant_Sequoia);
        test.add(Aurea_Atlas_Cedar);
        test.add(Columnar_Norway_Spruce);
        test.add(Paperbark_Maple);
        test.add(Manchurian_Maple);
        test.add(Little_Gem_Spruce);
        test.add(Bloodgood_Japanese_Maple);
        test.add(Silver_King_Euonymus);
        test.add(Moonshadow_Euonymus);
        test.add(Golden_Euonymus);
        test.add(Green_Spire_Euonymus);
        test.add(Blue_Point_Juniper);
        test.add(Australis_Magnolia);
        test.add(Green_Giant_Arborvitae);
        test.add(Weeping_Alaskan_Cedar);
        test.add(Contorta_Pine);
        test.add(Little_Gem_Magnolia);
        test.add(Otto_Luyken_Cherry_Laurel);
        test.add(Skip_Laurel);
        test.add(Serbian_Spruce);
        test.add(Ann_Magnolia);
        test.add(Forsythia);
        test.add(Dappled_Willow);
        test.add(Radicans_Cryptomeria);
        test.add(Prairiefire_Crabapple);
        test.add(Tulip_Poplar);
        test.add(Sweet_Bay_Magnolia);
        test.add(Celeste_Fig);
        test.add(Male_Kiwi);
        test.add(Wonderful_Pomegranate);
        test.add(Caroline_Raspberry);
        test.add(Ouachita_Blackberry);
        test.add(Female_Kiwi);
        test.add(Issai_Kiwi);
        test.add(Triple_Crown_Blackberry);
        test.add(Concord_Grape);
        test.add(Neptune_Grape);
        test.add(Jewel_Raspberry);
        test.add(Hinnonmaki_Gooseberry);
        test.add(Pixwell_Gooseberry);
        test.add(Black_Beauty_Elderberry);
        test.add(Black_Lace_Elderberry);
        test.add(Raspberry_Shortcake);
        test.add(Willamette_Raspberry);
        test.add(Pink_Icing_Blueberry);
        test.add(Peach_Sorbet_Blueberry);
        test.add(Blueberry_Glaze);
        test.add(Duke_Blueberry);
        test.add(Chippewa_Blueberry);
        test.add(Jersey_Blueberry);
        test.add(Prime_Ark_Blackberry);
        test.add(Chandler_Blueberry);
        test.add(ONeal_Blueberry);
        test.add(Patriot_Blueberry);
        test.add(Blue_Jay_Blueberry);

        test2.clear();
        selection.clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_xs = (CheckBox) findViewById(R.id.cb_xs);
        cb_s = (CheckBox) findViewById(R.id.cb_s);
        cb_m = (CheckBox) findViewById(R.id.cb_m);
        cb_l = (CheckBox) findViewById(R.id.cb_l);
        cb_xl = (CheckBox) findViewById(R.id.cb_xl);
        cb_xxl = (CheckBox) findViewById(R.id.cb_xxl);
        cb_deciduous = (CheckBox) findViewById(R.id.cb_deciduous);
        cb_evergreen = (CheckBox) findViewById(R.id.cb_evergreen);
        cb_y1 = (CheckBox) findViewById(R.id.cb_y1);
        cb_y2 = (CheckBox) findViewById(R.id.cb_y2);
        cb_y3 = (CheckBox) findViewById(R.id.cb_y3);
        cb_y4 = (CheckBox) findViewById(R.id.cb_y4);
        cb_slow = (CheckBox) findViewById(R.id.cb_slow);
        cb_mod = (CheckBox) findViewById(R.id.cb_mod);
        cb_fast = (CheckBox) findViewById(R.id.cb_fast);
        cb_none1 = (CheckBox) findViewById(R.id.cb_none1);
        cb_red = (CheckBox) findViewById(R.id.cb_red);
        cb_white = (CheckBox) findViewById(R.id.cb_white);
        cb_pink = (CheckBox) findViewById(R.id.cb_pink);
        cb_yellow = (CheckBox) findViewById(R.id.cb_yellow);
        cb_orange = (CheckBox) findViewById(R.id.cb_orange);
        cb_none2 = (CheckBox) findViewById(R.id.cb_none2);
        cb_apple = (CheckBox) findViewById(R.id.cb_apple);
        cb_pear = (CheckBox) findViewById(R.id.cb_pear);
        cb_peach = (CheckBox) findViewById(R.id.cb_peach);
        cb_almond = (CheckBox) findViewById(R.id.cb_almond);
        cb_lemon = (CheckBox) findViewById(R.id.cb_lemon);
        cb_lime = (CheckBox) findViewById(R.id.cb_lime);
        cb_kiwi = (CheckBox) findViewById(R.id.cb_kiwi);
        cb_fig = (CheckBox) findViewById(R.id.cb_fig);
        cb_persimmon = (CheckBox) findViewById(R.id.cb_persimmon);
        cb_grape = (CheckBox) findViewById(R.id.cb_grape);
        cb_blueberry = (CheckBox) findViewById(R.id.cb_blueberry);
        cb_blackberry = (CheckBox) findViewById(R.id.cb_blackberry);
        cb_raspberry = (CheckBox) findViewById(R.id.cb_raspberry);
        cb_pomegranate = (CheckBox) findViewById(R.id.cb_pomegranate);
        cb_plum = (CheckBox) findViewById(R.id.cb_plum);
        cb_gooseberry = (CheckBox) findViewById(R.id.cb_gooseberry);
        cb_elderberry = (CheckBox) findViewById(R.id.cb_elderberry);
        cb_pecan = (CheckBox) findViewById(R.id.cb_pecan);
        cb_walnut = (CheckBox) findViewById(R.id.cb_walnut);

        test.add(Brown_Turkey_Fig);
        test.add(Emerald_Green_Arborvitae);
        test.add(Delaware_Valley_White_Azalea);
        test.add(Lemon_Pfizz_Juniper);
        test.add(Kwanzan_Cherry);
        test.add(Ebony_Flame_Crape_Myrtle);
        test.add(Dragon_Lady_Holly);
        test.add(Autumn_Blaze_Maple);
        test.add(Leyland_Cypress);
        test.add(Manhattan_Euonymus);
        test.add(Inkberry_Holly);
        test.add(Cherokee_Holly);
        test.add(Green_Luster_Holly);
        test.add(Compacta_Holly);
        test.add(Sky_Pencil_Holly);
        test.add(Helleri_Holly);
        test.add(Red_Beauty_Holly);
        test.add(Soft_Touch_Holly);
        test.add(Nellie_Stevens_Holly);
        test.add(China_Twins_Holly);
        test.add(Hoogendoorn_Holly);
        test.add(Dynamite_Crape_Myrtle);
        test.add(Nantucket_Privet);
        test.add(Acer_Palmatum_Japanese_Maple);
        test.add(Weeping_Giant_Sequoia);
        test.add(Aurea_Atlas_Cedar);
        test.add(Columnar_Norway_Spruce);
        test.add(Paperbark_Maple);
        test.add(Manchurian_Maple);
        test.add(Little_Gem_Spruce);
        test.add(Bloodgood_Japanese_Maple);
        test.add(Silver_King_Euonymus);
        test.add(Moonshadow_Euonymus);
        test.add(Golden_Euonymus);
        test.add(Green_Spire_Euonymus);
        test.add(Blue_Point_Juniper);
        test.add(Australis_Magnolia);
        test.add(Green_Giant_Arborvitae);
        test.add(Weeping_Alaskan_Cedar);
        test.add(Contorta_Pine);
        test.add(Little_Gem_Magnolia);
        test.add(Otto_Luyken_Cherry_Laurel);
        test.add(Skip_Laurel);
        test.add(Serbian_Spruce);
        test.add(Ann_Magnolia);
        test.add(Forsythia);
        test.add(Dappled_Willow);
        test.add(Radicans_Cryptomeria);
        test.add(Prairiefire_Crabapple);
        test.add(Tulip_Poplar);
        test.add(Sweet_Bay_Magnolia);
        test.add(Celeste_Fig);
        test.add(Male_Kiwi);
        test.add(Wonderful_Pomegranate);
        test.add(Caroline_Raspberry);
        test.add(Ouachita_Blackberry);
        test.add(Female_Kiwi);
        test.add(Issai_Kiwi);
        test.add(Triple_Crown_Blackberry);
        test.add(Concord_Grape);
        test.add(Neptune_Grape);
        test.add(Jewel_Raspberry);
        test.add(Hinnonmaki_Gooseberry);
        test.add(Pixwell_Gooseberry);
        test.add(Black_Beauty_Elderberry);
        test.add(Black_Lace_Elderberry);
        test.add(Raspberry_Shortcake);
        test.add(Willamette_Raspberry);
        test.add(Pink_Icing_Blueberry);
        test.add(Peach_Sorbet_Blueberry);
        test.add(Blueberry_Glaze);
        test.add(Duke_Blueberry);
        test.add(Chippewa_Blueberry);
        test.add(Jersey_Blueberry);
        test.add(Prime_Ark_Blackberry);
        test.add(Chandler_Blueberry);
        test.add(ONeal_Blueberry);
        test.add(Patriot_Blueberry);
        test.add(Blue_Jay_Blueberry);

        test2.clear();
        selection.clear();
    }

    public void next(View view) {

        if (cb_xs.isChecked()) {
            for(Plant p : test) {
                if (p.getSize().equals("xs")){
                    selection.add(p.getName());
                } else {
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_s.isChecked()) {
            for(Plant p : test){
                if(p.getSize().equals("s")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_m.isChecked()) {
            for(Plant p : test){
                if(p.getSize().equals("m")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_l.isChecked()) {
            for(Plant p : test){
                if(p.getSize().equals("l")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_xl.isChecked()) {
            for(Plant p : test){
                if(p.getSize().equals("xl")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_xxl.isChecked()) {
            for(Plant p : test){
                if(p.getSize().equals("xxl")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_deciduous.isChecked()) {
            for(Plant p : test){
                if(p.getType().equals("deciduous")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_evergreen.isChecked()) {
            for(Plant p : test){
                if(p.getType().equals("evergreen")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_y1.isChecked()) {
            for(Plant p : test){
                if(p.getPrivacy() == true){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_y2.isChecked()) {
            for(Plant p : test){
                if(p.getShade() == true){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_y3.isChecked()) {
            for(Plant p : test){
                if(p.getHedge() == true){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_y4.isChecked()) {
            for(Plant p : test){
                if(p.getVine() == true){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_slow.isChecked()) {
            for(Plant p : test){
                if(p.getGrowth().equals("slow")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_mod.isChecked()) {
            for(Plant p : test){
                if(p.getGrowth().equals("mod")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_fast.isChecked()) {
            for(Plant p : test){
                if(p.getGrowth().equals("fast")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_none1.isChecked()) {
            for(Plant p : test){
                if(p.getFlowering().equals("none")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_red.isChecked()) {
            for(Plant p : test){
                if(p.getFlowering().equals("red")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_white.isChecked()) {
            for(Plant p : test){
                if(p.getFlowering().equals("white")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_pink.isChecked()) {
            for(Plant p : test){
                if(p.getFlowering().equals("pink")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_yellow.isChecked()) {
            for(Plant p : test){
                if(p.getFlowering().equals("yellow")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_orange.isChecked()) {
            for(Plant p : test){
                if(p.getFlowering().equals("orange")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_none2.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("none")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_apple.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("apple")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_pear.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("pear")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_peach.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("peach")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_almond.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("almond")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_lemon.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("lemon")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_lime.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("lime")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_kiwi.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("kiwi")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_fig.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("fig")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_persimmon.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("persimmon")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_grape.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("grape")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_blueberry.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("blueberry")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_blackberry.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("blackberry")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_raspberry.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("raspberry")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_pomegranate.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("pomegranate")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_plum.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("plum")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_gooseberry.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("gooseberry")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_elderberry.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("elderberry")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_pecan.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("pecan")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }
        if (cb_walnut.isChecked()) {
            for(Plant p : test){
                if(p.getFruitNut().equals("walnut")){
                    selection.add(p.getName());
                }
                else{
                    selection.remove(p.getName());
                    test2.add(p);
                }
            }
            test.removeAll(test2);
        }

        Intent intent = new Intent(this, Main2Activity.class);
        String final_selection = "";
        Set<String> hs = new HashSet<String>();
        hs.addAll(selection);
        selection.clear();
        selection.addAll(hs);
        for(String Selections : selection){
            final_selection = final_selection + Selections + "\n";
        }
        intent.putExtra("choice", final_selection);
        startActivity(intent);
    }
}
