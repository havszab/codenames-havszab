package com.codecool.havszab.codenames.service;

import com.codecool.havszab.codenames.model.Info;
import com.codecool.havszab.codenames.model.User;
import com.codecool.havszab.codenames.repository.InfoRepository;

import com.codecool.havszab.codenames.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {

    public InitializerBean(InfoRepository infoRepository, UserRepository userRepository) {
        //Init rules and hints:
        infoRepository.save(new Info(
                "The roles",
                "Players split into two teams: red and blue. " +
                        "One player of each team is selected as the team's spymaster, the others are field operatives.",
                "red_vs_blue.jpg"));
        infoRepository.save(new Info(
                "The key",
                "Twenty-five code name cards, each bearing a word, are laid out in a 5×5 rectangular grid, in random order." +
                        " A number of these words represent red agents, a number represent blue agents," +
                        " one represents an assassin, and the others represent innocent bystanders.",
                "key.png"));
        infoRepository.save(new Info(
                "As spymaster",
                "Give verbal hints to your field operatives to successfully locate the agents bound to your team. " +
                        "Hints have to be single-word and should relate to as much team-agents as possible by its meaning. " +
                        "After choosing the hint, you have to provide a number to your operatives to specify how many words you connected with it." +
                        "They originally can vote to words at the maximum quantity you provided, extended with a bonus opportunity of tipping." +
                        "Giving a higher number to operatives to enable more tips can be smart, but it can be misleading, too." ,
                "spymaster.jpg"));
        infoRepository.save(new Info(
                "Be correct!",
                "As spymaster you have to find out the hints by respecting the following rules: " +
                        "Giving the keyword by grammatical similarities is incorrect, you have to connect the words by their meanings only. " +
                        "Your hint has to be single-word, only in case of a property name is the multi-word expression allowed. " +
                        "You can't use the words which refer to non-located agents.",
                ""));
        infoRepository.save(new Info(
                "Turns",
                "Red and blue teams take turns. Each turn is began by the spymaster, who gives a keyword and a specified number. " +
                        "Then field operatives try to guess the words which can be associated with the keyword. " +
                        "The turn lasts while the team uses all of their guessing possibilities, or the time is up, eventually when they make wrong assotiation, " +
                        "whichever comes first. Tipping badly can be dangerous for the team: They can locate an innocent bystander, what simply causes the turn's end. " +
                        "If you the other team's agent you help the concurrent team, and also the turn ends. " +
                        "But you can do a bigger mistake by spotting the assassin, what means the mission is lost for you instantly.",
                "crime.png"));
        infoRepository.save(new Info(
                "The time",
                "Setting up a time limit for turns can make the game more exciting. " +
                        "You can do this while creating a game. If you - as a field operative - find the time limit too short, or just want to make the game less exciting, " +
                        "you can use a time-extender which can be used only once per team per turn. " +
                        "This useful item is available in the shop, visit it to lower the risk of the mission failure. ",
                "time_extension.jpeg"));

        userRepository.save(new User(
                "TheFirst",
                "hahaha",
                "havsza@gmail.com"
        ));
    }



}
