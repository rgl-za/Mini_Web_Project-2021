package Mini_Web_Project2021.Mini_Web_Project.api;

import Mini_Web_Project2021.Mini_Web_Project.domain.Member;
import Mini_Web_Project2021.Mini_Web_Project.repository.MemberRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberRepository memberRepository;

    @PostMapping("/api/members")
    public CreateMemberResponse saveMember(@RequestBody Member member)
    {
        Long id = memberRepository.join(member);
        return new CreateMemberResponse(id);
    }

    @Data
    static class CreateMemberRequest{
        private String name;
        private String nick_name;
    }

    @Data
    class CreateMemberResponse{
        private Long id;

        public CreateMemberResponse(Long id) {
            this.id = id;
        }
    }

}
