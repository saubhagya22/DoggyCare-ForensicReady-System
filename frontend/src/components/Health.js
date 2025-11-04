import React, {useEffect, useState} from 'react';

export default function Health(){
    const [msg, setMsg] = useState('checking backend...');
    useEffect(()=>{
        fetch('/api/health').then(r=>r.text()).then(t=>setMsg(t)).catch(()=>setMsg('backend unreachable'));
    },[]);
    return <div><strong>Backend status:</strong> {msg}</div>;
}
