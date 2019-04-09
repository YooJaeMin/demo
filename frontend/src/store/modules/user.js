import userApi from '../../api/userApi'
const state = {
    message: '',
    bookname: '',
    user: {
    }
}

const mutations = {
    getId(){
        return state.user.id;
    },
    getUserType(){
        return state.user.usertype;
    },
    getUsername(){
        return state.user.username;
    },
    setUserProfile(state, userInfo){
        state.user = userInfo
    }
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

const actions = {
    getUserProfile ({commit}) {
        userApi.getUserInfo(userInfo => {
            commit('setUserProfile', userInfo)
        })
    }
}

export default {
    namespaced: true,
    state,
    actions,
    mutations
  }
  