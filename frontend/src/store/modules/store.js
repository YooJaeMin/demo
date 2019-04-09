export default  {
    state: {
        message: '',
        bookname: '',
        user: {
        }
    },
    mutations: {
        getId(){
            return state.user.id;
        },
        getUserType(){
            return state.user.usertype;
        },
        getUsername(){
            return state.user.username;
        },
        // setId(chgId){
        //     state.user.id = chgId;
        // },
        // setUserType(chgUserType){
        //     state.user.usertype = chgUserType;
        // },
        // setUsername(chgName){
        //     state.user.username = chgName;
        // },
        // setUser(chgUser){
        //     state.user = chgUser;
        // },
    }
}