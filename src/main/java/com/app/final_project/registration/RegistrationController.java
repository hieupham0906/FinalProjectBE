//package com.app.final_project.registration;
//
//import com.app.final_project.registration.Interface.IRegistrationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("api/registration")
//public class RegistrationController {
//
//    @Autowired
//    IRegistrationService registrationService;
//    @PostMapping("registerEvent")
//    public ResponseEntity<?> registerEvent(@RequestParam(required = true) Integer eventId) {
//        Boolean result = registrationService.registerEvent(eventId);
//        if (result)  {
//         return ResponseEntity.ok("Registration successful");
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration Failed.");
//    }
//
//    @PostMapping("cancelRegistration")
//    public ResponseEntity<?> cancelRegistration(@RequestParam(required = true) Integer eventId) {
//        Boolean result = registrationService.cancelRegistration(eventId);
//        if (result) {
//            return ResponseEntity.ok("Cancellation successful");
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cancellation failed.");
//    }
//
//    @GetMapping("/isUserRegistered")
//    public ResponseEntity<?> isUserRegistered(@RequestParam(required = true) Integer eventId) {
//        boolean isRegistered = registrationService.isUserRegistered(eventId);
//        return ResponseEntity.ok(isRegistered);
//    }
//    @DeleteMapping("removeRegistrantFromEvent")
//    ResponseEntity<?> removeRegistrantFromEvent(@RequestParam("userId") Integer userId,
//                                      @RequestParam("eventId") Integer eventId) {
//        Boolean result = registrationService.registrationService(userId, eventId);
//        if (result) {
//            return ResponseEntity.ok("Cancellation successful");
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cancellation failed.");
//    }
//    @PutMapping("updateStatusRegistrants")
//    public ResponseEntity<?> updateStatusRegistrants(@RequestParam("userId") Integer userId,
//                                                     @RequestParam("eventId") Integer eventId,
//                                                     @RequestParam("update-by") Integer updateBy) {
//        boolean isChangeStatus= registrationService.updateStatusRegistrants(eventId, userId,updateBy);
//        if (isChangeStatus)
//            return ResponseEntity.ok("update success");
//        return ResponseEntity.badRequest().body("update false");
//    }
//    @PutMapping("updateStatusRegistrantsPredicted")
//    public ResponseEntity<?> updateStatusRegistrantsPredicted(@RequestParam("eventId") Integer eventId){
//        if(eventId == null){
//            return ResponseEntity.badRequest().body("update false");
//        }
//        boolean isChangeStatus = registrationService.updateStatusRegistrantsPredicted(eventId);
//        if (isChangeStatus)
//            return ResponseEntity.ok("update success");
//        return ResponseEntity.badRequest().body("update false");
//    }
//}
