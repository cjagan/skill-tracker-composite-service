package com.iiht.fse4.skilltracker.composite.controller;

import com.iiht.fse4.skilltracker.composite.model.AddProfileResponse;
import com.iiht.fse4.skilltracker.composite.model.GetProfileResponse;
import com.iiht.fse4.skilltracker.composite.service.SkillTrackerService;
import com.iiht.fse4.skilltracker.composite.util.UnitTestUtil;
import com.iiht.fse4.skilltracker.composite.model.Profile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

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

    @Test
    void testGetProfilesByAssociateId() throws Exception {
        Mockito.doReturn(UnitTestUtil.getProfileResponseByAssociateId()).when(skillTrackerService).getProfiles((any(String.class)));
        ResponseEntity<GetProfileResponse> responseEntity = skillTrackerController.getProfileList("CTS1");
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        GetProfileResponse response = responseEntity.getBody();
        assertNotNull(response);
        for (Profile profile : response.getProfileList()) {
            assertEquals("CTS1", profile.getAssociateId());
        }
    }

    @Test
    void testGetProfiles() throws Exception {
        Mockito.doReturn(UnitTestUtil.getProfileResponse()).when(skillTrackerService).getProfiles((any(String.class)));
        ResponseEntity<GetProfileResponse> responseEntity = skillTrackerController.getProfileList("");
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        GetProfileResponse response = responseEntity.getBody();
        assertNotNull(response);
        assertEquals(2, response.getProfileList().size());
    }


    @Test
    void testAddProfile() throws Exception {
        Mockito.doReturn(UnitTestUtil.addProfileResponse()).when(skillTrackerService).addProfile(UnitTestUtil.buildAddProfileRequest());
        ResponseEntity<AddProfileResponse> responseEntity = skillTrackerController.addProfile(UnitTestUtil.buildAddProfileRequest());
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        AddProfileResponse response = responseEntity.getBody();
        assertNotNull(response);
        assertEquals(true, response.isAdded());
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