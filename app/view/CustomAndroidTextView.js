import React, {
    Component,
} from 'react'


import {
    View,
    requireNativeComponent,
} from 'react-native'

const AndroidTextView = requireNativeComponent('CustomAndroidTextView', CustomAndroidTextView);

export default class CustomAndroidTextView extends Component {

    //构造函数
    constructor(props) {
        super(props)
    }

    render() {
        return <AndroidTextView {...this.props}/>
    }
}

CustomAndroidTextView.propTypes = {
    valuetext: React.PropTypes.string,
    ...View.propTypes,
};