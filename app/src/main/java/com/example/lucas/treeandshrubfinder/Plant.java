package com.example.lucas.treeandshrubfinder;

/**
 * Created by lucas on 6/1/2017.
 */

public class Plant implements Cloneable{
    String Name;
    String Size;
    String Type;
    Boolean Privacy;
    Boolean Shade;
    Boolean Hedge;
    Boolean Vine;
    String Growth;
    String Flowering;
    String FruitNut;

    Plant(){
        Name = "";
        Size = "";
        Type = "";
        Privacy = false;
        Shade = false;
        Hedge = false;
        Vine = false;
        Growth = "";
        Flowering = "";
        FruitNut = "";
    }

    Plant(String name){
        if(name == "Brown Turkey Fig"){
            this.Name = "Brown Turkey Fig";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "fig";
        }
        else if(name == "Emerald Green Arborvitae"){
            this.Name = "Emerald Green Arborvitae";
            Size = "l";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Delaware Valley White Azalea"){
            this.Name = "Delaware Valley White Azalea";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Lemon Pfizz Juniper"){
            this.Name = "Lemon Pfizz Juniper";
            Size = "xs";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Kwanzan Cherry"){
            this.Name = "Kwanzan Cherry";
            Size = "xxl";
            Type = "deciduous";
            Privacy = false;
            Shade = true;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "pink";
            FruitNut = "none";
        }
        else if(name == "Ebony Flame Crape Myrtle"){
            this.Name = "Ebony Flame Crape Myrtle";
            Size = "m";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "red";
            FruitNut = "none";
        }
        else if(name == "Dragon Lady Holly"){
            this.Name = "Dragon Lady Holly";
            Size = "l";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Autumn Blaze Maple"){
            this.Name = "Autumn Blaze Maple";
            Size = "xxl";
            Type = "deciduous";
            Privacy = false;
            Shade = true;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Leyland Cypress"){
            this.Name = "Leyland Cypress";
            Size = "xxl";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Manhattan Euonymus"){
            this.Name = "Manhattan Euonymus";
            Size = "m";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Inkberry Holly"){
            this.Name = "Inkberry Holly";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "slow";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Cherokee Holly"){
            this.Name = "Cherokee Holly";
            Size = "m";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Green Luster Holly"){
            this.Name = "Green Luster Holly";
            Size = "xs";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Compacta Holly"){
            this.Name = "Compacta Holly";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Sky Pencil Holly"){
            this.Name = "Sky Pencil Holly";
            Size = "m";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Helleri Holly"){
            this.Name = "Helleri Holly";
            Size = "xs";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "slow";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Red Beauty Holly"){
            this.Name = "Red Beauty Holly";
            Size = "m";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Soft Touch Holly"){
            this.Name = "Soft Touch Holly";
            Size = "xs";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Nellie Stevens Holly"){
            this.Name = "Nellie Stevens Holly";
            Size = "xl";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "China Twins Holly"){
            this.Name = "China Twins Holly";
            Size = "m";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Hoogendoorn Holly"){
            this.Name = "Hoogendoorn Holly";
            Size = "xs";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Dynamite Crape Myrtle"){
            this.Name = "Dynamite Crape Myrtle";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "red";
            FruitNut = "none";
        }
        else if(name == "Nantucket Privet"){
            this.Name = "Nantucket Privet";
            Size = "l";
            Type = "deciduous";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Acer Palmatum Japanese Maple"){
            this.Name = "Acer Palmatum Japanese Maple";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Weeping Giant Sequoia"){
            this.Name = "Weeping Giant Sequoia";
            Size = "xxl";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Aurea Atlas Cedar"){
            this.Name = "Aurea Atlas Cedar";
            Size = "xxl";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Columnar Norway Spruce"){
            this.Name = "Columnar Norway Spruce";
            Size = "xxl";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Paperbark Maple"){
            this.Name = "Paperbark Maple";
            Size = "xl";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Manchurian Maple"){
            this.Name = "Manchurian Maple";
            Size = "xxl";
            Type = "deciduous";
            Privacy = false;
            Shade = true;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Little Gem Spruce"){
            this.Name = "Little Gem Spruce";
            Size = "xs";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Bloodgood Japanese Maple"){
            this.Name = "Bloodgood Japanese Maple";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Silver King Euonymus"){
            this.Name = "Silver King Euonymus";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Moonshadow Euonymus"){
            this.Name = "Moonshadow Euonymus";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Golden Euonymus"){
            this.Name = "Golden Euonymus";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Green Spire Euonymus"){
            this.Name = "Green Spire Euonymus";
            Size = "s";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Blue Point Juniper"){
            this.Name = "Blue Point Juniper";
            Size = "l";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Australis Magnolia"){
            this.Name = "Australis Magnolia";
            Size = "xxl";
            Type = "evergreen";
            Privacy = true;
            Shade = true;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Green Giant Arborvitae"){
            this.Name = "Green Giant Arborvitae";
            Size = "xxl";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Weeping Alaskan Cedar"){
            this.Name = "Weeping Alaskan Cedar";
            Size = "xxl";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Contorta Pine"){
            this.Name = "Contorta Pine";
            Size = "l";
            Type = "evergreen";//
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Little Gem Magnolia"){
            this.Name = "Little Gem Magnolia";
            Size = "xl";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Otto Luyken Cherry Laurel"){
            this.Name = "Otto Luyken Cherry Laurel";
            Size = "s";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Skip Laurel"){
            this.Name = "Skip Laurel";
            Size = "l";
            Type = "evergreen";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Serbian Spruce"){
            this.Name = "Serbian Spruce";
            Size = "xxl";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Ann Magnolia"){
            this.Name = "Ann Magnolia";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "red";
            FruitNut = "none";
        }
        else if(name == "Forsythia"){
            this.Name = "Forsythia";
            Size = "m";
            Type = "deciduous";
            Privacy = true;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "yellow";
            FruitNut = "none";

        }else if(name == "Dappled Willow"){
            this.Name = "Dappled Willow";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = true;
            Vine = false;
            Growth = "fast";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Radicans Cryptomeria"){
            this.Name = "Radicans Cryptomeria";
            Size = "xxl";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "none";
        }
        else if(name == "Prairiefire Crabapple"){
            this.Name = "Prairiefire Crabapple";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = true;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "red";
            FruitNut = "none";
        }
        else if(name == "Tulip Poplar"){
            this.Name = "Tulip Poplar";
            Size = "xxl";
            Type = "deciduous";
            Privacy = false;
            Shade = true;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "yellow";
            FruitNut = "none";
        }
        else if(name == "Sweet Bay Magnolia"){
            this.Name = "Sweet Bay Magnolia";
            Size = "xxl";
            Type = "evergreen";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "none";
        }
        else if(name == "Celeste Fig"){
            this.Name = "Celeste Fig";
            Size = "m";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "fig";
        }
        else if(name == "Male Kiwi"){
            this.Name = "Male Kiwi";
            Size = "xl";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "fast";
            Flowering = "white";
            FruitNut = "kiwi";
        }
        else if(name == "Wonderful Pomegranate"){
            this.Name = "Wonderful Pomegranate";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "pomegranate";
        }
        else if(name == "Caroline Raspberry"){
            this.Name = "Caroline Raspberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "raspberry";
        }
        else if(name == "Ouachita Blackberry"){
            this.Name = "Ouachita Blackberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blackberry";
        }
        else if(name == "Female Kiwi"){
            this.Name = "Female Kiwi";
            Size = "xl";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "fast";
            Flowering = "white";
            FruitNut = "kiwi";
        }
        else if(name == "Issai Kiwi"){
            this.Name = "Issai Kiwi";
            Size = "xl";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "kiwi";
        }
        else if(name == "Triple Crown Blackberry"){
            this.Name = "Triple Crown Blackberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "blackberry";
        }
        else if(name == "Concord Grape"){
            this.Name = "Concord Grape";
            Size = "l";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "fast";
            Flowering = "grape";
            FruitNut = "grape";
        }
        else if(name == "Neptune Grape"){
            this.Name = "Neptune Grape";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = true;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "grape";
        }
        else if(name == "Jewel Raspberry"){
            this.Name = "Jewel Raspberry";
            Size = "xs";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "raspberry";
        }
        else if(name == "Hinnonmaki Gooseberry"){
            this.Name = "Hinnonmaki Gooseberry";
            Size = "xs";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "gooseberry";
        }
        else if(name == "Pixwell Gooseberry"){
            this.Name = "Pixwell Gooseberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "gooseberry";
        }
        else if(name == "Black Beauty Elderberry"){
            this.Name = "Black Beauty Elderberry";
            Size = "m";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "false";
            FruitNut = "elderberry";
        }
        else if(name == "Black Lace Elderberry"){
            this.Name = "Black Lace Elderberry";
            Size = "m";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "elderberry";
        }
        else if(name == "Raspberry Shortcake"){
            this.Name = "Raspberry Shortcake";
            Size = "xs";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "fast";
            Flowering = "none";
            FruitNut = "raspberry";
        }
        else if(name == "Willamette Raspberry"){
            this.Name = "Willamette Raspberry";
            Size = "xs";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "raspberry";
        }
        else if(name == "Pink Icing Blueberry"){
            this.Name = "Pink Icing Blueberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "pink";
            FruitNut = "blueberry";
        }
        else if(name == "Peach Sorbet Blueberry"){
            this.Name = "Peach sorbet Blueberry";
            Size = "xs";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "blueberry";
        }
        else if(name == "Blueberry Glaze"){
            this.Name = "Blueberry Glaze";
            Size = "xs";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "white";
            FruitNut = "blueberry";
        }
        else if(name == "Duke Blueberry"){
            this.Name = "Duke Blueberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blueberry";
        }
        else if(name == "Chippewa Blueberry"){
            this.Name = "Chippewa Blueberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "slow";
            Flowering = "none";
            FruitNut = "blueberry";
        }
        else if(name == "Jersey Blueberry"){
            this.Name = "Jersey Blueberry";
            Size = "m";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blueberry";
        }
        else if(name == "Prime Ark Blackberry"){
            this.Name = "Prime Ark Blackberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blackberry";
        }
        else if(name == "Chandler Blueberry"){
            this.Name = "Chandler Blueberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blueberry";
        }
        else if(name == "ONeal Blueberry"){
            this.Name = "ONeal Blueberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blueberry";
        }
        else if(name == "Patriot Blueberry"){
            this.Name = "Patriot Blueberry";
            Size = "s";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blueberry";
        }
        else if(name == "Blue Jay Blueberry"){
            this.Name = "Blue Jay Blueberry";
            Size = "m";
            Type = "deciduous";
            Privacy = false;
            Shade = false;
            Hedge = false;
            Vine = false;
            Growth = "mod";
            Flowering = "none";
            FruitNut = "blueberry";
        }
    }

    Plant(String Name, String Size, String Type, Boolean Privacy, Boolean Shade, Boolean Hedge, Boolean Vine, String Growth, String Flowering, String FruitNut){
        this.Name = Name;
        this.Size = Size;
        this.Type = Type;
        this.Privacy = Privacy;
        this.Shade = Shade;
        this.Hedge = Hedge;
        this.Vine = Vine;
        this.Growth = Growth;
        this.Flowering = Flowering;
        this.FruitNut = FruitNut;
    }
    public String getName() {
        return Name;
    }
    public String getType() {
        return Type;
    }
    public Boolean getShade() {
        return Shade;
    }
    public String getSize() {
        return Size;
    }
    public Boolean getPrivacy() {return Privacy;}
    public Boolean getHedge() {
        return Hedge;
    }
    public Boolean getVine() {
        return Vine;
    }
    public String getGrowth() { return Growth; }
    public String getFlowering() {return Flowering; }
    public String getFruitNut() {
        return FruitNut;
    }
}
