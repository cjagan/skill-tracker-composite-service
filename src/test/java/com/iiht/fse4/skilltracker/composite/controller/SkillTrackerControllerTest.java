package com.iiht.fse4.skilltracker.composite.controller;

import com.iiht.fse4.skilltracker.composite.service.SkillTrackerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.ActiveProfiles;

@ExtendWith(MockitoExtension.class)
@ActiveProfiles(profiles = "test")
@AutoConfigureMockMvc
class SkillTrackerControllerTest {

    @InjectMocks
    SkillTrackerController skillTrackerController;

    @Mock
    SkillTrackerService skillTrackerService;


    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }


/*    @Test
    void testUpdateProfile() throws Exception {
        doReturn(UnitTestUtil.updateProfileResponse()).when(skillTrackerService.updateProfile(UnitTestUtil.buildUpdateProfileRequest()));
        ResponseEntity<UpdateProfileResponse> responseEntity = skillTrackerController.updateProfile(UnitTestUtil.buildUpdateProfileRequest());
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        UpdateProfileResponse response = responseEntity.getBody();
        assertNotNull(response);
        assertEquals(true, response.isUpdated());
    }*/

}