package io.github.hurynoviuch.playground.factory;

import io.github.hurynoviuch.playground.dto.User;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.validation.Validated;
import jakarta.inject.Singleton;

import javax.el.ExpressionFactory;
import javax.validation.Valid;
import java.util.List;
import java.util.random.RandomGenerator;

@Validated
@Factory
public class CommonsFactory {
  private RandomGenerator rnd = RandomGenerator.getDefault();
  private List<String> names = List.of(
     "John", "Mary", "Michael", "Jennifer", "James", "Elizabeth", "David", "Sarah", "Robert", "Jessica", "William", "Emily", "Joseph", "Samantha", "Charles", "Ashley",
     "Thomas", "Amanda", "Daniel", "Melissa", "Matthew", "Nicole", "Christopher", "Stephanie", "Andrew", "Brittany", "Joshua", "Lauren", "George", "Megan", "Steven", "Tiffany",
     "Edward", "Amber", "Brian", "Rachel", "Kevin", "Christina", "Mark", "Heather", "Anthony", "Kimberly", "Donald", "Angela", "Ronald", "Michelle", "Richard", "Rebecca", "Jason",
     "Amy", "Lisa", "Patricia", "Timothy", "Crystal", "Jeffrey", "Laura", "Scott", "Erin", "Ryan", "Kelly", "Gary", "Christine", "Jacob", "Shannon", "Larry", "Andrea", "Kenneth",
     "Tracy", "Gregory", "Karen", "Benjamin", "Dawn", "Samuel", "Carrie", "Patrick", "April", "Jonathan", "Julia", "Nicholas", "Shannon", "Dennis", "Tara", "Jerry", "Monica",
     "Douglas", "Kristin", "Terry", "Victoria", "Peter", "Jamie", "Roger", "Holly", "Lawrence", "Stacy", "Martin", "Dawn", "Jesse", "Teresa", "Phillip", "Dana"
  );
  private List<String> surnames = List.of(
     "Bungo", "Zoodle", "Quibble", "Fizzle", "Snickerdoodle", "Bumble", "Wizzle", "Jambalaya", "Frizzle", "Boondoggle", "Quirk", "Noodle", "Zephyr", "Pizzazz", "Wombat",
     "Quixote", "Zonk", "Jibber", "Fandango", "Brouhaha", "Zippy", "Quibble", "Flapjack", "Wiggles", "Jinx", "Quagmire", "Zazzle", "Bop", "Snuggle", "Whizbang", "Juggle",
     "Quokka", "Zipper", "Fiasco", "Bongo", "Whirligig", "Zest", "Jitterbug", "Flibbertigibbet", "Bonanza", "Quasar", "Zilch", "Jamboree", "Flutter", "Boomerang", "Zoom",
     "Quickstep", "Whimsy", "Jabberwocky", "Fuzzball", "Blubber", "Zephyr", "Quibble", "Fandango", "Boondoggle", "Snickerdoodle", "Wombat", "Quirk", "Bumblebee", "Zoodle",
     "Jambalaya", "Frizzle", "Brouhaha", "Wizzle", "Quixote", "Noodle", "Pizzazz", "Zonk", "Jibber", "Zippy", "Fizzle", "Bungo", "Flapjack", "Wiggles", "Jinx", "Quagmire",
     "Zazzle", "Snuggle", "Bop", "Whizbang", "Juggle", "Quokka", "Zipper", "Fiasco", "Bongo", "Whirligig", "Zest", "Jitterbug", "Flibbertigibbet", "Bonanza", "Quasar", "Zilch",
     "Jamboree", "Flutter", "Boomerang", "Zoom", "Quickstep", "Whimsy", "Jabberwocky", "Fuzzball"
  );

  @Bean
  @Prototype
  @Valid public User newRandomUser() {
    User result = new User();
    result.setName(names.get(rnd.nextInt(names.size())));
    result.setSurname(surnames.get(rnd.nextInt(surnames.size())));
    return result;
  }

  @Singleton
  public ExpressionFactory newElFactory() {
    return ExpressionFactory.newInstance();
  }
}
