/**
 * Mocking client-server processing
 */
import axios from 'axios'
const _userProfile = {}
  
  export default {
    getUserInfo (cb, userInfo) {
        const baseURI = 'https://10.10.76.233:1234';
        axios.post(`${baseURI}/user/getprofile`, {
            id: 'admin@naver.com',
          })
          .then(function (response) {
            console.log(response);
            _userProfile = response;
            cb(_userProfile);
          })
          .catch(function (error) {
            console.log(error);
          });
        // console.log(this.$http);
        //   this.$http.get(`${baseURI}/user/getprofile/id=admin@naver.com`)
        //   .then(function (response) {
        //     console.log(response);
        //     _userProfile = response;
        //     cb(_userProfile);
        //   })
        //   .catch(function (error) {
        //     console.log(error);
        //   });
    },
  
    // buyProducts (products, cb, errorCb) {
    //   setTimeout(() => {
    //     // simulate random checkout failure.
    //     (Math.random() > 0.5 || navigator.userAgent.indexOf('PhantomJS') > -1)
    //       ? cb()
    //       : errorCb()
    //   }, 100)
    // }
  }
  