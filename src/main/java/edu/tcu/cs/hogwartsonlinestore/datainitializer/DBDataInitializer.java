package edu.tcu.cs.hogwartsonlinestore.datainitializer;

import edu.tcu.cs.hogwartsonlinestore.dao.ProductRepository;
import edu.tcu.cs.hogwartsonlinestore.domain.Comment;
import edu.tcu.cs.hogwartsonlinestore.domain.Product;
import edu.tcu.cs.hogwartsonlinestore.domain.User;
import edu.tcu.cs.hogwartsonlinestore.service.ProductService;
import edu.tcu.cs.hogwartsonlinestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DBDataInitializer implements CommandLineRunner {
    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }
    private void loadData() {
        // populate products and comments
        final Product prod1 = new Product("Dragon Liver", true, new BigDecimal("16.00"));
        prod1.setDescription("A Dragon liver was the liver taken from a dragon. They cost sixteen Sickles an ounce, and were used as potion-ingredients, particularly in the brewing of Doxycide and the Healing Potion.");
        prod1.setImageURL("/images/products/DragonLiver.png");

        final Product prod2 = new Product("Golden Snitch", false, new BigDecimal("1.25"));
        prod2.setDescription("The Golden Snitch, often simply called the Snitch, is the third and smallest ball used in Quidditch. It is a walnut-sized gold-coloured sphere with silver wings. It flies around the Quidditch field at high speeds, sometimes pausing and hovering in place.");
        prod2.setImageURL("/images/products/GoldenSnitch.png");

        final Product prod3 = new Product("Unicorn Hair", true, new BigDecimal("2.50"));
        prod3.setDescription("Unicorn hair was a powerful magical substance with a variety of uses, originating on the body of a unicorn. It can be used as the core of wands. It was frequently shed from the creature.");
        prod3.setImageURL("/images/products/UnicornHair.png");

        final Product prod4 = new Product("Horn of Bicon", true, new BigDecimal("18.75"));
        prod4.setDescription("Bicorns possessed two large horns. These horns were shed annually and were gathered when the Bicorn was not looking. One powdered horn was a required ingredient for Polyjuice Potion. It was not found in the student store-cupboard, but Professor Snape kept one in his office.");
        prod4.setImageURL("/images/products/BicornHorn.png");

        final Product prod5 = new Product("Floating Candle", true, new BigDecimal("6.34"));
        prod5.setDescription("The Great Hall floating candles are sticks of wax floating and covering the entire ceiling of the Great Hall to give the Hogwarts students light while they are eating during a feast, breakfast, lunch or dinner.");
        prod5.setImageURL("/images/products/FloatingCandle.jpg");

        final Product prod6 = new Product("Gobstone", true, new BigDecimal("1.99"));
        prod6.setDescription("A Gobstone is a round ball used to play popular wizarding game Gobstones. Gobstones are similar to ordinary Muggle marbles, except that when a player loses a point in Gobstones, the stone spits a putrid liquid at the player. Sold in sets of thirty, Gobstones are most commonly made of stone, but may also be made of precious metals, such as gold.");
        prod6.setImageURL("/images/products/Gobstone.png");

        final Product prod7 = new Product("Butterbeer", true, new BigDecimal("3.07"));
        prod7.setDescription("Butterbeer was a popular wizarding beverage described as tasting \"a little bit like less-sickly butterscotch\". It was served at numerous locations in the wizarding world and had a very slight alcoholic content. Students of Hogwarts School of Witchcraft and Wizardry would often buy it when visiting Hogsmeade.");
        prod7.setImageURL("/images/products/Butterbeer.jpg");

        final Product prod8 = new Product("Winged Catapult", true, new BigDecimal("2.58"));
        prod8.setDescription("A winged catapult is a magical catapult with wings which allows it to fly. ");
        prod8.setImageURL("/images/products/WingedCatapult.png");

        final Product prod9 = new Product("Threat Meter", true, new BigDecimal("3.02"));
        prod9.setDescription("The Threat meter was a magical device not unlike to the Magical Exposure Threat measurer at the headquarters of the Magical Congress of the United States of America, New York, and was by the Statute of Secrecy Task Force in the 21st century to identify the danger a given Foundable posted to the Statute of Secrecy. It was discovered that the more likely a Foundable is to break the International Statute of Secrecy, the higher the threat given by the system became, and the more difficult it was to return it to whence it came.");
        prod9.setImageURL("/images/products/ThreatMeter.png");

        final Product prod10 = new Product("Invisible Ink", true, new BigDecimal("2.58"));
        prod10.setDescription("Invisible Ink was a type of magical ink that transfigures anything written in it to become invisible. Text written in invisible ink can be rendered visible again in two ways, either by using a Revealer or the spell Aparecium.");
        prod10.setImageURL("/images/products/InvisibleInk.jpg");

        final Product prod11 = new Product("Remembrall", true, new BigDecimal("5.98"));
        prod11.setDescription("A Remembrall is a magical large marble-sized glass ball that contains smoke which turns red when its owner or user has forgotten something. It turns clear once whatever was forgotten is remembered.");
        prod11.setImageURL("/images/products/Remembrall.gif");

        final Product prod12 = new Product("Flipendo Button", false, new BigDecimal("2.08"));
        prod12.setDescription("Flipendo Buttons were magical buttons in Hogwarts School of Witchcraft and Wizardry and other places such as Ollivanders that were bound to only activate when the Knockback Jinx, Flipendo, was cast on them.");
        prod12.setImageURL("/images/products/FlipendoButton.png");

        final Product prod13 = new Product("Chocolate Frog", false, new BigDecimal("1.75"));
        prod13.setDescription("Chocolate frogs were a very popular wizarding sweet made from chocolate in the form of a frog. They came with a collectible card of a famous witch or wizard in each pack. The frogs were made of seventy percent croakoa. Presumably, this substance was what allowws them to magically act like an actual frog.");
        prod13.setImageURL("/images/products/ChocolateFrog.png");

        final Product prod14 = new Product("Unicorn Blood", false, new BigDecimal("5.01"));
        prod14.setDescription("Unicorn blood was a thick, silvery magical substance that runs within a unicorn's veins. The blood of a unicorn will keep you alive, even if you are an inch from death, but at a terrible price. You have slain something pure and defenceless to save yourself, and you will have but a half-life, a cursed life, from the moment the blood touches your lips.");
        prod14.setImageURL("/images/products/UnicornBlood.png");

        final Product prod15 = new Product("Gillyweed", true, new BigDecimal("2.40"));
        prod15.setDescription("Gillyweed was a magical plant that, when eaten, allowed a human to breathe underwater. It was said to resemble a bundle of slimy, grey-green rat tails. When eaten, it gave the consumer gills, allowing them to breathe underwater, and webbing between the fingers and toes, allowing them to swim underwater with ease. Gillyweed was native to the Mediterranean Sea.");
        prod15.setImageURL("/images/products/Gillyweed.png");

        final Product prod16 = new Product("Dittany", true, new BigDecimal("2.19"));
        prod16.setDescription("Dittany is a magical plant used in potion-making. It is a powerful healing herb and restorative. Its use makes fresh skin grow over a wound and after application the wound seems several days old.");
        prod16.setImageURL("/images/products/Dittany.png");

        final Product prod17 = new Product("Granian Hair", true, new BigDecimal("3.24"));
        prod17.setDescription("Granian hair is hair taken from a Granian Winged horse, which can be used as a potion ingredient, such as in the Exstimulo Potion.");
        prod17.setImageURL("/images/products/GranianHair.png");

        final Product prod18 = new Product("Fluxweed", true, new BigDecimal("3.17"));
        prod18.setDescription("Fluxweed was a magical plant and member of the mustard family known for its healing properties.");
        prod18.setImageURL("/images/products/Fluxweed.png");

        final Product prod19 = new Product("Owl Treat", true, new BigDecimal("8.88"));
        prod19.setDescription("Owl Treats are pet food intended for consumption by owls.");
        prod19.setImageURL("/images/products/OwlTreat.png");

        final Product prod20 = new Product("Top Dog Biscuits", false, new BigDecimal("3.90"));
        prod20.setDescription("Top Dog Biscuits was a wizarding brand of dog food. The box had a picture of a fully clothed dog eating falling dog treats with colourful letters around it spelling \"WOLF 'EM DOWN!\". These dog biscuits also, according to the box, bit the dog back.");
        prod20.setImageURL("/images/products/TopDogBiscuits.png");

        final Product prod21 = new Product("Knotgrass", true, new BigDecimal("10.13"));
        prod21.setDescription("Knotgrass is a plant with magical properties. It is used in Potion-making, and is an essential ingredient in the making of the Polyjuice Potion, as well as in the brewing of the alcoholic beverage Knotgrass Mead.");
        prod21.setImageURL("/images/products/Knotgrass.png");

        final Product prod22 = new Product("Butterscotch", true, new BigDecimal("2.44"));
        prod22.setDescription("Butterscotch is a type of confectionery that may also be used in some potions, such as the Dawdle Draught, where it is used to give off an alluring, sweet scent. It is also the prime ingredient in Butterbeer, which tastes like \"less-sickly butterscotch.\"");
        prod22.setImageURL("/images/products/Butterscotch.png");

        final Product prod23 = new Product("Billywig Sting", true, new BigDecimal("2.30"));
        prod23.setDescription("The sting of the Billywig caused giddiness, followed by levitation. Dried billywig stings were used as ingredients in several potions, including the Antidote to Uncommon Poisons and the Wideye Potion. It was also rumoured to be an ingredient in the popular sweet Fizzing Whizzbees. The stings produced a slime, which was is also used in potion-making.");
        prod23.setImageURL("/images/products/BillywigSting.png");

        final Product prod24 = new Product("Caterpillar", true, new BigDecimal("2.48"));
        prod24.setDescription("Sliced caterpillars are used as an ingredient in the Shrinking Solution.");
        prod24.setImageURL("/images/products/Caterpillars.png");

        final Product prod25 = new Product("Peacock Feather", true, new BigDecimal("4.72"));
        prod25.setDescription("Peacock feathers were the feathers of a peacock. They were used in Dragon Tonic. Also, Quills could be made out of these feathers. Gilderoy Lockhart owned a peacock feather quill that he used for signing autographs, which matched his flamboyant nature. Garrick Ollivander's peacock would lose its feathers if it got scared, and sold them at one Knut for each feather.");
        prod25.setImageURL("/images/products/PeacockFeather.png");

        final Product prod26 = new Product("Erumpent horn", true, new BigDecimal("6.46"));
        prod26.setDescription("An Erumpent horn is the horn of an Erumpent, a magical beast. The horn contains a fluid that causes whatever it is injected into to explode. They are highly prized as potion ingredients, but are listed as a Class-B Tradeable Material.");
        prod26.setImageURL("/images/products/ErumpentHorn.png");

        final Product prod27 = new Product("Nagini's venom", false, new BigDecimal("3.48"));
        prod27.setDescription("The venom produced from the snake-form of the Maledictus, Nagini, was an extremely potent poison that prevents the wounds of the victim from healing. This would lead to severe blood loss that must be compensated with a Blood-Replenishing Potion, or the blood loss severity would turn fatal. There was an antidote to it, though apparently hard to find. The venom is capable of melting stitches, rendering it an ineffective treatment.");
        prod27.setImageURL("/images/products/Nagini.jpg");

        final Product prod28 = new Product("Bitter Root", true, new BigDecimal("18.34"));
        prod28.setDescription("Bitter root (alternatively spelled bitterroot) is a plant that can be used as a potion ingredient. It is used in the Exstimulo Potion, Strong Exstimulo Potion and Potent Exstimulo Potion, and is presumably one the ingredients used to brew the Burning Bitterroot Balm, a healing potion.");
        prod28.setImageURL("/images/products/BitterRoot.png");

        final Product prod29 = new Product("Hermit Crab Shell", true, new BigDecimal("3.52"));
        prod29.setDescription("The shell of a hermit crab is used an ingredient in making potions, such as the Dawdle Draught.");
        prod29.setImageURL("/images/products/HermitCrabShell.png");

        final Product prod30 = new Product("Beetle Eye", true, new BigDecimal("4.00"));
        prod30.setDescription("Beetle eyes are the eyes of beetles and a common potion ingredient.");
        prod30.setImageURL("/images/products/BeetleEyes.png");

        prod2.addComment(new Comment(1, "I'm so sad this product is no longer available!"));
        prod2.addComment(new Comment(2, "When do you expect to have it back?"));

        prod13.addComment(new Comment(3, "Very tasty! I'd definitely buy it again!"));
        prod13.addComment(new Comment(4, "My kids love it!"));
        prod13.addComment(new Comment(5, "Good, my basic breakfast cereal. Though maybe a bit in the sweet side..."));
        prod13.addComment(new Comment(6, "Not that I find it bad, but I think the vanilla flavouring is too intrusive"));
        prod13.addComment(new Comment(7, "I agree with the excessive flavouring, but still one of my favourites!"));
        prod13.addComment(new Comment(8, "Cheaper than at the local store!"));
        prod13.addComment(new Comment(9, "I'm sorry to disagree, but IMO these are far too sweet"));
        prod13.addComment(new Comment(10, "Good. Pricey though."));

        prod9.addComment(new Comment(11, "Made bread with this and it was great!"));
        prod9.addComment(new Comment(12, "Note: this comes actually mixed with wheat flour"));

        prod14.addComment(new Comment(13, "Awesome Spanish oil. Buy it now."));
        prod14.addComment(new Comment(14, "Would definitely buy it again. Best one I've tasted"));
        prod14.addComment(new Comment(15, "A bit acid for my taste, but still a very nice one."));
        prod14.addComment(new Comment(16, "Definitely not the average olive oil. Really good."));

        prod16.addComment(new Comment(17, "Great value!"));

        prod24.addComment(new Comment(18, "My favourite :)"));

        prod30.addComment(new Comment(19, "Too hard! I would not buy again"));
        prod30.addComment(new Comment(20, "Taste is OK, but I agree with previous comment that bars are too hard to eat"));
        prod30.addComment(new Comment(21, "Would definitely NOT buy again. Simply unedible!"));

        productService.save(prod1);
        productService.save(prod2);
        productService.save(prod3);
        productService.save(prod4);
        productService.save(prod5);
        productService.save(prod6);
        productService.save(prod7);
        productService.save(prod8);
        productService.save(prod9);
        productService.save(prod10);
        productService.save(prod11);
        productService.save(prod12);
        productService.save(prod13);
        productService.save(prod14);
        productService.save(prod15);
        productService.save(prod16);
        productService.save(prod17);
        productService.save(prod18);
        productService.save(prod19);
        productService.save(prod20);
        productService.save(prod21);
        productService.save(prod22);
        productService.save(prod23);
        productService.save(prod24);
        productService.save(prod25);
        productService.save(prod26);
        productService.save(prod27);
        productService.save(prod28);
        productService.save(prod29);
        productService.save(prod30);

        // create some users
        User u1 = new User();
        u1.setUsername("john");
        u1.setPassword("123456");
        u1.setEnabled(true);
        u1.setRoles("admin");
        u1.setFirstname("John");
        u1.setLastname("Apricot");

        User u2 = new User();
        u2.setUsername("eric");
        u2.setPassword("654321");
        u2.setEnabled(true);
        u2.setRoles("user");

        User u3 = new User();
        u3.setUsername("tom");
        u3.setPassword("qwerty");
        u3.setEnabled(false);
        u3.setRoles("user");

        userService.save(u1);
        userService.save(u2);
        userService.save(u3);

    }
}
