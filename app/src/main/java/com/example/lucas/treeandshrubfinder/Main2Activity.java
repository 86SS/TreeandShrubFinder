package com.example.lucas.treeandshrubfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import static com.example.lucas.treeandshrubfinder.R.id.textView;

public class Main2Activity extends AppCompatActivity {

    AutoCompleteTextView edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv_results = (TextView) findViewById(R.id.tv_results);
        TextView tv1 = (TextView) findViewById(R.id.tv1);

        AutoCompleteTextView edit = (AutoCompleteTextView) findViewById(R.id.et_item);

        String[] items = getResources().getStringArray(R.array.items_array);
        java.util.Arrays.sort(items);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        edit.setAdapter(adapter);

        Intent intent = getIntent();
        String str = intent.getStringExtra("choice");
        if(str.equals("")){
            tv1.setText("No items match your selection. Please try again, and be sure that no contradiciting boxes are checked, i.e. 'Deciduous' and 'Evergreen', etc., and that there is not a space at the end of the name.");
            tv_results.setText("");
        }
        else{
            tv_results.setText(str);
        }
    }

    public void find(View view) {

        String name = edit.getText().toString();

        if(name.equalsIgnoreCase("Brown Turkey Fig")){
            Intent intent = new Intent(this, BrownTurkeyFig.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Emerald Green Arborvitae")){
            Intent intent = new Intent(this, EmeraldGreenArborvitae.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Delaware Valley White Azalea")){
            Intent intent = new Intent(this, DelawareValleyWhiteAzalea.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Lemon Pfizz Juniper")){
            Intent intent = new Intent(this, LemonPfizzJuniper.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Kwanzan Cherry")){
            Intent intent = new Intent(this, KwanzanCherry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Ebony Flame Crape Myrtle")){
            Intent intent = new Intent(this, EbonyFlameCrapeMyrtle.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Dragon Lady Holly")){
            Intent intent = new Intent(this, DragonLadyHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Autumn Blaze Maple")){
            Intent intent = new Intent(this, AutumnBlazeMaple.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Leyland Cypress")){
            Intent intent = new Intent(this, LeylandCypress.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Manhattan Euonymus")){
            Intent intent = new Intent(this, ManhattanEuonymus.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Inkberry Holly")){
            Intent intent = new Intent(this, InkberryHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Cherokee Holly")){
            Intent intent = new Intent(this, CherokeeHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Green Luster Holly")){
            Intent intent = new Intent(this, GreenLusterHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Compacta Holly")){
            Intent intent = new Intent(this, CompactaHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Sky Pencil Holly")){
            Intent intent = new Intent(this, SkyPencilHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Helleri Holly")){
            Intent intent = new Intent(this, HelleriHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Red Beauty Holly")){
            Intent intent = new Intent(this, RedBeautyHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Soft Touch Holly")){
            Intent intent = new Intent(this, SoftTouchHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Nellie Stevens Holly")){
            Intent intent = new Intent(this, NellieStevensHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("China Twins Holly")){
            Intent intent = new Intent(this, ChinaTwinsHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Hoogendoorn Holly")){
            Intent intent = new Intent(this, HoogendoornHolly.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Dynamite Crape Myrtle")){
            Intent intent = new Intent(this, DynamiteCrapeMyrtle.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Nantucket Privet")){
            Intent intent = new Intent(this, NantucketPrivet.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Acer Palmatum Japanese Maple")){
            Intent intent = new Intent(this, AcerPalmatumJapaneseMaple.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Weeping Giant Sequoia")){
            Intent intent = new Intent(this, WeepingGiantSequoia.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Aurea Atlas Cedar")){
            Intent intent = new Intent(this, AureaAtlasCedar.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Columnar Norway Spruce")){
            Intent intent = new Intent(this, ColumnarNorwaySpruce.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Paperbark Maple")){
            Intent intent = new Intent(this, PaperbarkMaple.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Manchurian Maple")){
            Intent intent = new Intent(this, ManchurianMaple.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Little Gem Spruce")){
            Intent intent = new Intent(this, LittleGemSpruce.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Bloodgood Japanese Maple")){
            Intent intent = new Intent(this, BloodgoodJapaneseMaple.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Silver King Euonymus")){
            Intent intent = new Intent(this, SilverKingEuonymus.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Moonshadow Euonymus")){
            Intent intent = new Intent(this, MoonshadowEuonymus.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Golden Euonymus")){
            Intent intent = new Intent(this, GoldenEuonymus.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Green Spire Euonymus")){
            Intent intent = new Intent(this, GreenSpireEuonymus.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Blue Point Juniper")){
            Intent intent = new Intent(this, BluePointJuniper.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Australis Magnolia")){
            Intent intent = new Intent(this, AustralisMagnolia.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Green Giant Arborvitae")){
            Intent intent = new Intent(this, GreenGiantArborvitae.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Weeping Alaskan Cedar")){
            Intent intent = new Intent(this, WeepingAlaskanCedar.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Contorta Pine")){
            Intent intent = new Intent(this, ContortaPine.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Little Gem Magnolia")){
            Intent intent = new Intent(this, LittleGemMagnolia.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Otto Luyken Cherry Laurel")){
            Intent intent = new Intent(this, OttoLuykenCherryLaurel.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Skip Laurel")){
            Intent intent = new Intent(this, SkipLaurel.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Serbian Spruce")){
            Intent intent = new Intent(this, SerbianSpruce.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Ann Magnolia")){
            Intent intent = new Intent(this, AnnMagnolia.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Forsythia")){
            Intent intent = new Intent(this, Forsythia.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Dappled Willow")){
            Intent intent = new Intent(this, DappledWillow.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Radicans Cryptomeria")){
            Intent intent = new Intent(this, RadicansCryptomeria.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Prairiefire Crabapple")){
            Intent intent = new Intent(this, PrairiefireCrabapple.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Tulip Poplar")){
            Intent intent = new Intent(this, TulipPoplar.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Sweet Bay Magnolia")){
            Intent intent = new Intent(this, SweetBayMagnolia.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Celeste Fig")){
            Intent intent = new Intent(this, CelesteFig.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Male Kiwi")){
            Intent intent = new Intent(this, MaleKiwi.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Wonderful Pomegranate")){
            Intent intent = new Intent(this, WonderfulPomegranate.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Caroline Raspberry")){
            Intent intent = new Intent(this, CarolineRaspberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Ouachita Blackberry")){
            Intent intent = new Intent(this, OuachitaBlackberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Female Kiwi")){
            Intent intent = new Intent(this, FemaleKiwi.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Issai Kiwi")){
            Intent intent = new Intent(this, IssaiKiwi.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Triple Crown Blackberry")){
            Intent intent = new Intent(this, TripleCrownBlackberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Concord Grape")){
            Intent intent = new Intent(this, ConcordGrape.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Neptune Grape")){
            Intent intent = new Intent(this, NeptuneGrape.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Jewel Raspberry")){
            Intent intent = new Intent(this, JewelRaspberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Hinnonmaki Gooseberry")){
            Intent intent = new Intent(this, HinnonmakiGooseberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Pixwell Gooseberry")){
            Intent intent = new Intent(this, PixwellGooseberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Black Beauty Elderberry")){
            Intent intent = new Intent(this, BlackBeautyElderberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Black Lace Elderberry")){
            Intent intent = new Intent(this, BlackLaceElderberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Raspberry Shortcake")){
            Intent intent = new Intent(this, RaspberryShortcake.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Willamette Raspberry")){
            Intent intent = new Intent(this, WillametteRaspberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Pink Icing Blueberry")){
            Intent intent = new Intent(this, PinkIcingBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Peach Sorbet Blueberry")){
            Intent intent = new Intent(this, PeachSorbetBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Blueberry Glaze")){
            Intent intent = new Intent(this, BlueberryGlaze.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Duke Blueberry")){
            Intent intent = new Intent(this, DukeBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Chippewa Blueberry")){
            Intent intent = new Intent(this, ChippewaBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Jersey Blueberry")){
            Intent intent = new Intent(this, JerseyBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Prime Ark Blackberry")){
            Intent intent = new Intent(this, PrimeArkBlackberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Chandler Blueberry")){
            Intent intent = new Intent(this, ChandlerBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("ONeal Blueberry")){
            Intent intent = new Intent(this, ONealBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Patriot Blueberry")){
            Intent intent = new Intent(this, PatriotBlueberry.class);
            startActivity(intent);
        }
        else if(name.equalsIgnoreCase("Blue Jay Blueberry")){
            Intent intent = new Intent(this, BlueJayBlueberry.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, NoResults.class);
            startActivity(intent);
        }
    }
}
