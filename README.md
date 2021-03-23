# Inslight Global Palindrome Challenge Application API
Given a string _s_, find the longest palindromic substring in _s_. You may assume that the maximum
length of _s_ is 1000.

## Tech Stack
| Technology | Version | Purpose |
| ------ | ------ | ------ |
| Java | 11| Programming Language |
| SpringBoot | 2.4.3 | Application Framework |
| Embedded Tomcat Server | 9 | To Deploy Application |
| Gradle |  6.8.3 | Build Tool |
| Swagger OpenApi | 3.0 | API Dcoumentaion and Testing |
| Junit, Mockito | 5 | Unit Test Cases |
| Log4j | 2.1.3 | To maintain Logs |
| yaml |  | To write application Properties info |


## Rest Apis Info
here we used 2 apis which are savePalindrome and Fetch Paindrome...
follwoing are the request and responses
##### Request: savePalindrome
value = "abbbbbbbbbbbacdadda"
##### Response:
{
    "palindromeValue": "abbbbbbbbbbbacdadda",
    "palindromeLongestValue": "abbbbbbbbbbba"
}

##### Request: fetchAllPalindromes

##### Response:
[
  {
    "palindromeValue": "abbbbbbbbbbbacdadda",
    "palindromeLongestValue": "abbbbbbbbbbba"
  },
  {
    "palindromeValue": "bbggsadasdldss",
    "palindromeLongestValue": "sdlds"
  }
]

##### swagger url:
http://localhost:8080/swagger-ui.html

![swagger](https://user-images.githubusercontent.com/81264996/112220275-107f6e80-8bf4-11eb-9cfb-092fcbe6edca.JPG)



```sh
Swagger Api Request for savePalindrome
```
![swagger-request](https://user-images.githubusercontent.com/81264996/112220346-2856f280-8bf4-11eb-9172-59ff5ae18277.JPG)
```sh
Swagger Api Response for fetchAllPalindromes
```
![swagger-response list of palindromes](https://user-images.githubusercontent.com/81264996/112220389-360c7800-8bf4-11eb-99d6-992041ebba12.JPG)

```sh
Test Case Results
```
![test-cases](https://user-images.githubusercontent.com/81264996/112220462-491f4800-8bf4-11eb-853a-4475dc2c20c6.JPG)

```sh
Code Coverage
```
![code-covergae](https://user-images.githubusercontent.com/81264996/112220507-589e9100-8bf4-11eb-8189-4dbe0f24613a.JPG)
```sh
H2 Database 
```
![h2](https://user-images.githubusercontent.com/81264996/112220568-69e79d80-8bf4-11eb-8476-f48fcbe0778c.JPG)

