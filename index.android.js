/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    View,
} from 'react-native';

import Circle from "./app/view/Circle";

export default class CustomRNViewDemo extends Component {
    render() {
        return (
            <View style={styles.container}>
                <View>
                    <Circle
                        style={{width: 100, height: 100}}
                        color={'#ff0000'}
                        radius={50}
                    />
                </View>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});

AppRegistry.registerComponent('CustomRNViewDemo', () => CustomRNViewDemo);
