package api.decola.tech.service.impl;

import api.decola.tech.domain.model.User;
import api.decola.tech.domain.model.Account;
import api.decola.tech.domain.model.Card;
import api.decola.tech.domain.model.Feature;
import api.decola.tech.domain.model.News;
import api.decola.tech.domain.repository.UserRepository;
import api.decola.tech.dto.UserDTO;
import api.decola.tech.dto.AccountDTO;
import api.decola.tech.dto.CardDTO;
import api.decola.tech.dto.FeatureDTO;
import api.decola.tech.dto.NewsDTO;
import api.decola.tech.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO findById(Long id) {
        return toDTO(userRepository.findById(id).orElseThrow(NoSuchElementException::new));
    }

    @Override
    public UserDTO create(UserDTO userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        User user = toEntity(userToCreate);
        return toDTO(userRepository.save(user));
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO update(Long id, UserDTO userToUpdate) {
        User existingUser = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        existingUser.setName(userToUpdate.getName());
        existingUser.setAccount(toEntity(userToUpdate.getAccount()));
        existingUser.setCard(toEntity(userToUpdate.getCard()));
        existingUser.setFeatures(userToUpdate.getFeatures().stream().map(this::toEntity).collect(Collectors.toList()));
        existingUser.setNews(userToUpdate.getNews().stream().map(this::toEntity).collect(Collectors.toList()));
        return toDTO(userRepository.save(existingUser));
    }

    @Override
    public void delete(Long id) {
        User existingUser = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        userRepository.delete(existingUser);
    }

    private UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setAccount(toDTO(user.getAccount()));
        userDTO.setCard(toDTO(user.getCard()));
        userDTO.setFeatures(user.getFeatures().stream().map(this::toDTO).collect(Collectors.toList()));
        userDTO.setNews(user.getNews().stream().map(this::toDTO).collect(Collectors.toList()));
        return userDTO;
    }

    private User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setAccount(toEntity(userDTO.getAccount()));
        user.setCard(toEntity(userDTO.getCard()));
        user.setFeatures(userDTO.getFeatures().stream().map(this::toEntity).collect(Collectors.toList()));
        user.setNews(userDTO.getNews().stream().map(this::toEntity).collect(Collectors.toList()));
        return user;
    }

    private AccountDTO toDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId(account.getId());
        accountDTO.setNumber(account.getNumber());
        accountDTO.setAgency(account.getAgency());
        accountDTO.setBalance(account.getBalance());
        accountDTO.setLimit(account.getLimit());
        return accountDTO;
    }

    private Account toEntity(AccountDTO accountDTO) {
        Account account = new Account();
        account.setId(accountDTO.getId());
        account.setNumber(accountDTO.getNumber());
        account.setAgency(accountDTO.getAgency());
        account.setBalance(accountDTO.getBalance());
        account.setLimit(accountDTO.getLimit());
        return account;
    }

    private CardDTO toDTO(Card card) {
        CardDTO cardDTO = new CardDTO();
        cardDTO.setId(card.getId());
        cardDTO.setNumber(card.getNumber());
        cardDTO.setLimit(card.getLimit());
        return cardDTO;
    }

    private Card toEntity(CardDTO cardDTO) {
        Card card = new Card();
        card.setId(cardDTO.getId());
        card.setNumber(cardDTO.getNumber());
        card.setLimit(cardDTO.getLimit());
        return card;
    }

    private FeatureDTO toDTO(Feature feature) {
        FeatureDTO featureDTO = new FeatureDTO();
        featureDTO.setId(feature.getId());
        featureDTO.setIcon(feature.getIcon());
        featureDTO.setDescription(feature.getDescription());
        return featureDTO;
    }

    private Feature toEntity(FeatureDTO featureDTO) {
        Feature feature = new Feature();
        feature.setId(featureDTO.getId());
        feature.setIcon(featureDTO.getIcon());
        feature.setDescription(featureDTO.getDescription());
        return feature;
    }

    private NewsDTO toDTO(News news) {
        NewsDTO newsDTO = new NewsDTO();
        newsDTO.setId(news.getId());
        newsDTO.setIcon(news.getIcon());
        newsDTO.setDescription(news.getDescription());
        return newsDTO;
    }

    private News toEntity(NewsDTO newsDTO) {
        News news = new News();
        news.setId(newsDTO.getId());
        news.setIcon(newsDTO.getIcon());
        news.setDescription(newsDTO.getDescription());
        return news;
    }
}
