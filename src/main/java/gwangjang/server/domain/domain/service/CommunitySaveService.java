package gwangjang.server.domain.domain.service;

import gwangjang.server.domain.domain.entity.Community;
import gwangjang.server.domain.domain.repository.CommunityRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CommunitySaveService {

    private final CommunityRepository communityRepository;

    public Community save(Community community) {
        return communityRepository.save(community);
    }
}