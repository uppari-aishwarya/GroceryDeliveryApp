package com.grocery.dto;

 


import javax.validation.constraints.NotEmpty;

 

    public class UserDTO {


        @SuppressWarnings("unused")
        private int userId;

        private String userName;

        private String mobileNumber;
        private String email;

        @NotEmpty(message = "password is required")
        private String password;

      

 

        

 

        public UserDTO(int userId, String userName, String mobileNumber, String email,
                @NotEmpty(message = "password is required") String password) {
            super();
            this.userId = userId;
            this.userName = userName;
            this.mobileNumber = mobileNumber;
            this.email = email;
            this.password = password;
        }

 

        public String getUserName() {
            return userName;
        }

 

        public void setUserName(String userName) {
            this.userName = userName;
        }

 

        public String getPassword() {
            return password;
        }

 

        public void setPassword(String password) {
            this.password = password;
        }

 

        
        public void setEmail(String email) {
            this.email = email;
        }

 

        public String getEmail() {
            return email;
        }

 

        public String getMobileNumber() {
            return mobileNumber;
        }

 

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

 

       
 

        

 

    }